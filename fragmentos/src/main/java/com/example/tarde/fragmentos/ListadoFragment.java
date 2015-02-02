package com.example.tarde.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tarde on 02/02/2015.
 */
public class ListadoFragment extends Fragment {
    private ListView listado;


    //HAY QUE HACER LA ASOCIACION DEL FRAGMENTO CON EL LAYOUT

    @Nullable
    @Override
    //este metodo nos pide el view que corresponde al fragmento y tenemos que inflar el layoutAqui es donde generamos la vista
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_listado, container);
    }

    @Override
    //con este metodo la actividad ya esta creada y podemos aceder al arbol de componentes
   public void onActivityCreated(Bundle savedInstanceState) {
        //aqui ponemos la mision del fragmento, es decir lo que va a hacer. En este caso cargar la lista de datos

        super.onActivityCreated(savedInstanceState);
        //Para cargar la lista tenemos que:
        //1-obtener la lista (en este caso creamos un array)
        List<CorreoElectronico> list= Arrays.asList(
                new CorreoElectronico("Victor", "Prioritario", "Un correo de Victor"),
                new CorreoElectronico("Ana", "Normal", "Un correo de Ana"),
                new CorreoElectronico("Pepe", "Urgente", "Un correo de Pepe")
        );

        listado= (ListView) getActivity().findViewById(R.id.lvCorreos);
        //Aaptamos el array a tipo de listado view

        ListAdapter adaptadorCorreos=new ArrayAdapter<CorreoElectronico>(getActivity(),android.R.layout.simple_list_item_1, list);
   //stetteamos el adaptador a la lista
    listado.setAdapter(adaptadorCorreos);
        // el adaptador tambien controlara los cambios en la lista de elementos


          }

    //el list view tiene que definir un hadler sobre los itens del view que tiene que hacer navegacion entre intenciones o actualizar el otro fragmento de la activity

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);

    }
}
