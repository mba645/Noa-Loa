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
    String menu;

    int[] Loa = {R.drawable.lumino, R.drawable.seance};
    int[] Noa = {R.drawable.lvl1, R.drawable.ilot};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);
        menu = getIntent().getExtras().getString("submenu");
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        if(menu.equals("Loa"))
        {
            carouselView.setPageCount(2);
        }
        else if(menu.equals("Noa"))
        {
            carouselView.setPageCount(2);
        }

        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(final int position, ImageView imageView) {
            if(menu.equals("Loa"))
            {
                imageView.setImageResource(Loa[position]);
                imageView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        switch(position){
                            case 0 :
                                Intent intent = new Intent(Submenu.this, Luminotherapy.class);
                                startActivity(intent);
                                Submenu.this.finish();
                                break;
                            case 1 :
                                intent = new Intent(Submenu.this, Session.class);
                                startActivity(intent);
                                Submenu.this.finish();
                                break;
                            default:
                                break;
                        }

                    }
                });
            }
            else if(menu.equals("Noa"))
            {
                imageView.setImageResource(Noa[position]);
                imageView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        switch(position){
                            case 0 :
                                Intent intent = new Intent(Submenu.this, Profile.class);
                                startActivity(intent);
                                Submenu.this.finish();
                                break;
                            case 1 :
                                intent = new Intent(Submenu.this, Notepad.class);
                                startActivity(intent);
                                Submenu.this.finish();
                                break;
                            default:
                                break;
                        }

                    }
                });
            }

        }
    };

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Submenu.this, Menu.class);
        startActivity(intent);
        Submenu.this.finish();
    }

}
