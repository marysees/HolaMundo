package com.example.tarde.fragmentos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.Serializable;


public class DetalleActivity extends ActionBarActivity {

    public static final String KEY_CORREO_ITEM="correo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        CorreoElectronico item = (CorreoElectronico) getIntent().getSerializableExtra(KEY_CORREO_ITEM);

        DetalleFragment dtfrag= (DetalleFragment) getFragmentManager().findFragmentById(R.id.fragmentoListado);
        dtfrag.actualizarDetalle(item);

    }

}
