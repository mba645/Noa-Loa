package com.example.maxime.noaloa;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Humor extends AppCompatActivity {

    Button GoOn;
    ImageButton goodHumor;
    ImageButton midGoodHumor;
    ImageButton midHumor;
    ImageButton midBadHumor;
    ImageButton badHumor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

        final ConstraintLayout constLayout = (ConstraintLayout) findViewById(R.id.weatherlayout);
        final ImageView isle = (ImageView) findViewById(R.id.imageView);

        goodHumor = (ImageButton) findViewById(R.id.good);
        goodHumor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isle.setBackground(new ColorDrawable(Color.TRANSPARENT));
                constLayout.setBackground(getResources().getDrawable(R.drawable.ilotsun));
            }
        });

        midGoodHumor = (ImageButton) findViewById(R.id.midgood);
        midGoodHumor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isle.setBackground(new ColorDrawable(Color.TRANSPARENT));
                constLayout.setBackground(getResources().getDrawable(R.drawable.ilotbright));
            }
        });

        midHumor = (ImageButton) findViewById(R.id.mid);
        midHumor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isle.setBackground(new ColorDrawable(Color.TRANSPARENT));
                constLayout.setBackground(getResources().getDrawable(R.drawable.ilotcloudy));
            }
        });

        midBadHumor = (ImageButton) findViewById(R.id.midbad);
        midBadHumor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isle.setBackground(new ColorDrawable(Color.TRANSPARENT));
                constLayout.setBackground(getResources().getDrawable(R.drawable.ilotrain));
            }
        });

        badHumor = (ImageButton) findViewById(R.id.bad);
        badHumor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isle.setBackground(new ColorDrawable(Color.TRANSPARENT));
                constLayout.setBackground(getResources().getDrawable(R.drawable.ilotstorm));
            }
        });

        GoOn = (Button) findViewById(R.id.GoOn);
        GoOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Humor.this, Menu.class);
                startActivity(intent);
                Humor.this.finish();
            }
        });
    }
}
