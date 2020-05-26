package com.example.movielib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllMovies, btnCurrent, btnWantTo, btnSaw, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWigets();
        setOnClickListners();
    }

    private void initWigets(){
        btnAllMovies = (Button) findViewById(R.id.btnAllMovies);
        btnCurrent = (Button) findViewById(R.id.btnCurrent);
        btnWantTo = (Button) findViewById(R.id.btnWantTo);
        btnSaw = (Button) findViewById(R.id.btnSaw);
        btnAbout = (Button) findViewById(R.id.btnAbout);

    }

    private void setOnClickListners(){
        btnAllMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, allMoviesActivity.class);
                startActivity(intent);
            }
        });

    }
}
