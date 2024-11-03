package com.emreilgar.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void changeImage(View view){
        ImageView ataturkImage= findViewById(R.id.imageView);
        ataturkImage.setImageResource(R.drawable.image1);
    }

}