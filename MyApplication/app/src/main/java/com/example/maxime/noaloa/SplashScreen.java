package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final ImageView splash = (ImageView) findViewById(R.id.splashbutton);
        splash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreen.this, Humor.class);
                startActivity(intent);
                SplashScreen.this.finish();
            }
        });
    }
}
