package com.example.searchablespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> searchablespinner_list = new ArrayList<String>();

        SearchableSpinner searchablespinner = findViewById(R.id.searchablespinner);
        searchablespinner_list.add("Samsung");
        searchablespinner_list.add("Nokia");
        searchablespinner_list.add("Moto");
        searchablespinner_list.add("Google");
        searchablespinner_list.add("HTC");
        searchablespinner_list.add("Leveno");
        searchablespinner_list.add("Dell");
        searchablespinner_list.add("Oppo");
        searchablespinner_list.add("Micromax");
        searchablespinner_list.add("Lg");
        searchablespinner_list.add("Oppo");
        searchablespinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, searchablespinner_list));
    }
}