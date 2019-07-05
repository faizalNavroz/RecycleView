package com.example.fordlabs.recycleexample;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String>teams = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        teams.add("AUS") ;
        teams.add("IND");
        teams.add("ENG");
        setContentView(R.layout.activity_main);

        //get the recycler view and add linear layout
        //sets the row xml content to the main layout
        RecyclerView recylerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recylerView.setLayoutManager(layoutManager);

        //create a ref for CustomAdapter
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,teams);
        recylerView.setAdapter(adapter);




    }
}
