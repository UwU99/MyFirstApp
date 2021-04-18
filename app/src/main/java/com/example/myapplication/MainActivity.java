package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View screenView1, screenView2, screenView3;
    Button button1, button2, button3;
    int[] color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = new int[] {Color.YELLOW, Color.GREEN, Color.RED};

        screenView1 = findViewById(R.id.tvVar1);
        screenView2 = findViewById(R.id.tvVar2);
        screenView3 = findViewById(R.id.tvVar3);

        button1 = (Button) findViewById(R.id.btVar1);
        button2 = (Button) findViewById(R.id.btVar2);
        button3 = (Button) findViewById(R.id.btVar3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View1) {
                int arLength = color.length;

                Random random = new Random();
                int rNum = random.nextInt(arLength);

                screenView1.setBackgroundColor(color[rNum]);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View2) {
                int arLength = color.length;

                Random random = new Random();
                int rNum = random.nextInt(arLength);

                screenView2.setBackgroundColor(color[rNum]);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View3) {
                int arLength = color.length;

                Random random = new Random();
                int rNum = random.nextInt(arLength);

                screenView3.setBackgroundColor(color[rNum]);
            }
        });

    }
}