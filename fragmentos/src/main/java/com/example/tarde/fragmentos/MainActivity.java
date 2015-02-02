package com.example.tarde.fragmentos;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;


public class MainActivity extends ActionBarActivity {
    ListadoFragment fragmentoListado;
    DetalleFragment fragmentoDetalle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //el activity es el que tienen que obtener el hadler de los fragmes y discriminar lo que tiene que hacer

        //lo primero es saber en que situacion estamos (smartfhone, tv, tablet, etc..)para eso usamos el fragment manager

        FragmentManager fragmentManager = getFragmentManager();

       fragmentoListado= (ListadoFragment) fragmentManager.findFragmentById(R.id.fragmentoListado);
       fragmentoDetalle= (DetalleFragment) fragmentManager.findFragmentById(R.id.fragmentoDetalle);


        //Definir el listener para el onclick sobre la lista
        fragmentoListado.setOnItemClickListener((AdapterView.OnItemClickListener) this);

    }

    //El adapter view nos proporciona el listView
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){

        CorreoElectronico item=(CorreoElectronico) parent.getItemAtPosition(position);

        if (fragmentoDetalle !=null) {
            //estamos en un tablet

            fragmentoDetalle.actualizarDetalle(item);

        }else{
            //estamos en un smartfhone
            Intent intent=new Intent(this, DetalleActivity.class);
            intent.putExtra(DetalleActivity.KEY_CORREO_ITEM, item);
            startActivity(intent);

        }




    }




}
