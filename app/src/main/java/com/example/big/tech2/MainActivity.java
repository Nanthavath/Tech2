package com.example.big.tech2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button showProgressbar,hideProgressbar;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showProgressbar = findViewById(R.id.btnhide_progress);
        hideProgressbar = findViewById(R.id.btnhide_progress);
        progressBar = findViewById(R.id.progressbar);

        progressBar.setVisibility(View.GONE);

        showProgressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        hideProgressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.GONE);
            }
        });

    }
}
