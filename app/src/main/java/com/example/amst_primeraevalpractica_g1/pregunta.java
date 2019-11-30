package com.example.amst_primeraevalpractica_g1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pregunta extends AppCompatActivity {
   // final int puntaje=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1);
        Button btn2 =(Button)findViewById(R.id.button2);
        Button btn3 =(Button)findViewById(R.id.button3);
        Button btn4 =(Button)findViewById(R.id.button4);
        Button btn5 =(Button)findViewById(R.id.button5);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         //       puntaje++;
            }
        });
    }
}
