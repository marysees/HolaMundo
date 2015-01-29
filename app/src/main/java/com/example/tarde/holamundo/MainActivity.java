package com.example.tarde.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final int REQUEST_CODE_CON_RESULTADO =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //creamos y nos devuelve el objeto generico relacionado con el id que se indica
        View boton= findViewById(R.id.button);
       // boton.setOnClickListener(new SaludoOnClickListener());

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
             public void onClick(View v) {
                //indicamos que quiero que haga el evento
                //
               Intent intent= new Intent(MainActivity.this, SecondaryActivity.class);

                Intent dato = intent.putExtra("dato", "Mi nombre es Mary");

                //abrimos la nueva ventana
                startActivity(intent);

                //si queremos que la asctividad secundaria envie iinformacion a la actividad principal usamos
                //starActivityForResult

         }
        });


        View botonConResultado= findViewById(R.id.btConResultado);
        // boton.setOnClickListener(new SaludoOnClickListener());

        botonConResultado.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //indicamos que quiero que haga el evento
                //
                Intent intent= new Intent(MainActivity.this, ConResultadoActivity.class);

               //si queremos que la asctividad secundaria envie iinformacion a la actividad principal usamos
                startActivityForResult(intent, REQUEST_CODE_CON_RESULTADO);

            }
        });



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode== Activity.RESULT_OK){
            String resultado=data.getStringExtra("resultado");
            Toast.makeText(this, "El resultado es: "+resultado, Toast.LENGTH_LONG).show();

        }else{
            Log.i(MainActivity.class.getName(),"El resultado de la peticion no es correcto");
        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
