package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linear;
    private boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout) findViewById(R.id.linear);
        final AnimationDrawable animation = (AnimationDrawable) linear.getBackground();
        animation.start();
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    animation.stop();
                    flag = false;
                }else {
                    animation.start();
                    flag = true;
                }
            }
        });
    }
}
