package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Humor extends AppCompatActivity {

    Button GoOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

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
