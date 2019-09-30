package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button log_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log_in=findViewById(R.id.log_in_button);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_acvtvity();
            }
        });

    }
    void open_acvtvity(){
        Intent i=new Intent(this,CustomerMainScreen.class);
        startActivity(i);
    }
}
