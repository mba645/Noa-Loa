package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Luminotherapy extends AppCompatActivity {

    Button GoOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luminotherapy);

        GoOn = (Button) findViewById(R.id.GoOn);
        GoOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Luminotherapy.this, Menu.class);
                startActivity(intent);
                Luminotherapy.this.finish();
            }
        });
    }
}
