package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Session.this, Submenu.class);
        intent.putExtra("submenu", "Loa");
        startActivity(intent);
        Session.this.finish();
    }
}
