package com.example.wang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //use the string [] to store the answers-8 different answers
    final String[] answer ={"yes","I would think so", "It is so","No","Not a chance","Never","mayber","I would rather not say"};

    //implement the button massage-onclick

    public void buttonPress(View v){

        final TextView tv = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

        //
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_number = (int)(Math.random()*8);
                tv.setText(answer[random_number]);
            }
        });

    }


}
