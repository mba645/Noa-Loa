package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Notepad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Notepad.this, Submenu.class);
        intent.putExtra("submenu", "Noa");
        startActivity(intent);
        Notepad.this.finish();
    }
}
