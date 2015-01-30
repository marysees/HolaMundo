package com.example.tarde.sharedpreferences;


import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PreferenciasFragment extends PreferenceFragment {


    public void onCreated(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        addPreferencesFromResource(0);

    }


}
