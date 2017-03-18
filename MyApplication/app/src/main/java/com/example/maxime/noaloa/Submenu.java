package com.example.maxime.noaloa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Submenu extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.ilot, R.drawable.ilot};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);
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
                            Intent intent = new Intent(Submenu.this, Submenu.class);
                            intent.putExtra("Isle", "Loa");
                            startActivity(intent);
                            Submenu.this.finish();
                            break;
                        case 1 :
                            intent = new Intent(Submenu.this, Submenu.class);
                            intent.putExtra("Isle", "Noa");
                            startActivity(intent);
                            Submenu.this.finish();
                            break;
                        default:
                            break;
                    }

                }
            });
        }
    };

}
