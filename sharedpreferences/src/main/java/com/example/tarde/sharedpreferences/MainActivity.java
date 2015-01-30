package com.example.tarde.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view=findViewById(R.id.btPreferences);
            view.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this, PreferencesActivity.class);
                    startActivity(intent);

                }
            });




//------------------------------notas-------------------------------------
        //para establecer las preferencias de las actividades
       // para indicar preferencias de modo privado getPreferences(MODE_PRIVATE);

      // cuando tenemos mas de una preferencia  getSharedPreferences("",0);

        //habitualmente
       // SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
    //introducimos
       // SharedPreferences.Editor edit = preferences.edit();
       // edit.putString("nombre","Victor");
       //edit.commit();

       // Toast.makeText(this, preferences.getString("nombre", ""), Toast.LENGTH_LONG).show();
//--------------------------------------------------------------------------------
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
