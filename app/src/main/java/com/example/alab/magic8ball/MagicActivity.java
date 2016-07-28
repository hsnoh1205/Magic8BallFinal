package com.example.alab.magic8ball;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MagicActivity extends AppCompatActivity {
    TextView tv_text;

    String[] text;


    Typeface tf;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic);

        r = new Random();

        tf = Typeface.createFromAsset(getAssets(), "font.ttf");

        tv_text = (TextView) findViewById(R.id.tv_text);
        tv_text.setTypeface(tf);

        text = getResources().getStringArray(R.array.text);

        tv_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_text.setText(text[r.nextInt(20)]);
            }
        });
    }
}
