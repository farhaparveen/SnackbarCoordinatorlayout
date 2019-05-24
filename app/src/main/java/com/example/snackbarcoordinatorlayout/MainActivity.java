package com.example.snackbarcoordinatorlayout;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonSnack;
//CoordinatorLayout myLayout;
    LinearLayout myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSnack=findViewById(R.id.btn);
        myLayout=findViewById(R.id.myLayout);
        buttonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(myLayout,"Button has been clicked",Snackbar.LENGTH_SHORT).setAction("OPEN", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
buttonSnack.setBackgroundColor(Color.BLUE);
                    }
                }).show();
            }
        });
    }
}
