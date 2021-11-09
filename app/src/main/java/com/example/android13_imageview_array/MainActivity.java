package com.example.android13_imageview_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //int p = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private ImageView secondImage;
    public void findview(View view) {
        TextView TV = findViewById(R.id.textView);
        try {
            int[] imgId = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image44, R.drawable.image5,
                    R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image0};

            EditText input1 = findViewById(R.id.editTextNumber);
            secondImage = (ImageView) findViewById(R.id.imageButton);
            int input = Integer.parseInt(input1.getText().toString());
            if (0 < input && input < 11) {
                TV.setText("");
                secondImage.setImageResource(imgId[input - 1]);
            } else{
            TV.setText("重新輸入");
            }
        }catch (Exception e){
            TV.setText("重新輸入1");
        }
    }
}