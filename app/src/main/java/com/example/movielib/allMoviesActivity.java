package com.example.movielib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.LinearGradient;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class allMoviesActivity extends AppCompatActivity {

    private static final String TAG = "allMoviesActivity";

    private RecyclerView moviesRecView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_movies);
        Log.d(TAG, "onCreate: started");

    moviesRecView  = (RecyclerView) findViewById(R.id.moviesRecView);

    MoviesRecViewAdapter adapter = new MoviesRecViewAdapter(this);
    moviesRecView.setAdapter(adapter);
    moviesRecView.setLayoutManager(new LinearLayoutManager(this));

    }
}
