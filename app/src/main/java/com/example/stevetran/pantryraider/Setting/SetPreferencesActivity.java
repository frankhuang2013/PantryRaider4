package com.example.stevetran.pantryraider.Setting;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.GridLayout;



import com.example.stevetran.pantryraider.R;
import com.example.stevetran.pantryraider.Util.SharedConstants;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SetPreferencesActivity extends AppCompatActivity {

    ArrayList<String> dietPrefList = new ArrayList<String>();
    ArrayList<String> allergyPrefList = new ArrayList<String>();

    GridLayout dietPref;
    GridLayout allergyPref;

    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_preferences);

        dietPref = (GridLayout)findViewById(R.id.DietGrid);
        allergyPref = (GridLayout)findViewById(R.id.AllergyGrid);
        //Get existing list
        mDatabase = FirebaseDatabase.getInstance().getReference();

    }


    public void updatePreferencesClicked(View view) {
        updatePrefsToFirebase();
    }

    private void updatePrefsToFirebase(){
        String key = SharedConstants.FIREBASE_USER_ID;//mDatabase.child("Account").push().getKey();
        System.out.println(key);
        Map<String, Object> childUpdates = new HashMap<>();

        Map<String, Object> postDietValues = new HashMap<>();
        Map<String, Object> postAllergyValues = new HashMap<>();


        for(int i = 0; i < dietPref.getChildCount(); i++){
            CheckBox v = (CheckBox) dietPref.getChildAt(i);
            if(v.isChecked()){
                postDietValues.put((String)v.getTag(), true);
            } else {
                postDietValues.put((String)v.getTag(), false);
            }
        }

        for(int i = 0; i < allergyPref.getChildCount(); i++){
            CheckBox v = (CheckBox) allergyPref.getChildAt(i);
            if(v.isChecked()){
                postAllergyValues.put((String)v.getTag(), true);
            } else {
                postAllergyValues.put((String)v.getTag(), false);
            }
        }

        childUpdates.put("/Account/" + key + "/Preferences/", postDietValues);
        childUpdates.put("/Account/" + key + "/Allergies/", postAllergyValues);

        mDatabase.updateChildren(childUpdates);
        //mDatabase.push
    }



}
