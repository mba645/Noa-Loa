package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Menu extends AppCompatActivity {
    
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.ile, R.drawable.ile2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(2);

        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(final int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    switch(position){
                        case 0 :
                            Intent intent = new Intent(Menu.this, Luminotherapy.class);
                            startActivity(intent);
                            Menu.this.finish();
                            break;
                        default:
                            break;
                    }

                }
            });
        }
    };
}
