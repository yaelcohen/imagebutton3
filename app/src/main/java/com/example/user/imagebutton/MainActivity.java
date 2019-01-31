package com.example.user.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib= (ImageButton)findViewById(R.id.ib);
        iv= (ImageView) findViewById(R.id.iv);
    }

    public void click(View view) {
        Random rnd = new Random ();
        x= rnd.nextInt(3)+1;
        if (x==1) {
            iv.setImageResource(R.drawable.spongebob);
            ib.setImageResource(R.drawable.one);
        }
        if (x==2){
            iv.setImageResource(R.drawable.patrickstar);
            ib.setImageResource(R.drawable.two);
        }
        if (x==3){
            iv.setImageResource(R.drawable.squidward);
            ib.setImageResource(R.drawable.three);
        }

    }
}



