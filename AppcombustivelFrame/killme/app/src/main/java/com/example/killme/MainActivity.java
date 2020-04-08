package com.example.killme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

 Button mButton1;
 Button mButton2;
 Button mButton3;
 Button mButton4;

 String[] urls= new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.desisto);
        mButton2 = findViewById(R.id.surrender);
        mButton3 = findViewById(R.id.taskete);
        mButton4 = findViewById(R.id.ayuda);

        urls[0]="https://www.mercadolivre.com.br";
        urls[1]="https://www.kabum.com.br";
        urls[2]="https://www.olx.com.br";
        urls[3]="https://www.miess.com.br";

        mButton1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MeKill.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);


            }
        });

        mButton1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MeKill.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);


            }
        });

        mButton2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MeKill.class);
                intent.putExtra("links", urls[1]);
                startActivity(intent);


            }
        });
        mButton3.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MeKill.class);
                intent.putExtra("links", urls[2]);
                startActivity(intent);


            }
        });
        mButton4.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MeKill.class);
                intent.putExtra("links", urls[3]);
                startActivity(intent);


            }
        });





    }
}