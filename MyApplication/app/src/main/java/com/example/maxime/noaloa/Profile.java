package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Profile.this, Submenu.class);
        intent.putExtra("submenu", "Noa");
        startActivity(intent);
        Profile.this.finish();
    }

}
