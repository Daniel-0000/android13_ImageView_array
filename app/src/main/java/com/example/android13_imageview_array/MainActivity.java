package com.example.android13_imageview_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int p = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int[] imgId = {R.drawable.image1 , R.drawable.image2 , R.drawable.image3 , R.drawable.image44 , R.drawable.image5 ,
            R.drawable.image6 , R.drawable.image7 , R.drawable.image8 , R.drawable.image9 , R.drawable.image0};

    private ImageView secondImage;
    public void findview(View view) {
        secondImage = (ImageView) findViewById(R.id.imageButton);
        if (p < 10){
            secondImage.setImageResource(imgId[p]);
            p++;
        }else {
            p = 0;
        }
    }

}