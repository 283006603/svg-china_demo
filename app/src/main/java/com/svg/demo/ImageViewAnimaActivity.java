package com.svg.demo;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ImageViewAnimaActivity extends AppCompatActivity{

    ImageView imageView;
    private AnimatedVectorDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_anima);
        imageView=findViewById(R.id.ima_view);

        imageView.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v){
                drawable = (AnimatedVectorDrawable) imageView.getDrawable();
                drawable.start();
            }
        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        drawable.stop();
    }
}