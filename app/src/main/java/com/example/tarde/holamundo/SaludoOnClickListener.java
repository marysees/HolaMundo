package com.example.tarde.holamundo;

import android.view.View;

/**
 * Created by tarde on 29/01/2015.
 */
public class SaludoOnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
//el metodo view nos permite usar  el mgetContext que hace referencia a la actividad donde se creo el wiev, en este caso es en el main
            v.getContext();
    }
}
