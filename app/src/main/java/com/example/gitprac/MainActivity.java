package com.example.gitprac;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView4;
    long animationDuration = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
    }

    public void handleAnimation(View view) {

        ObjectAnimator animatorX = ObjectAnimator.ofFloat(imageView4,"x",420f);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(imageView4,"Y",200f);
        animatorX.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorX,animatorY);
        animatorSet.start();
    }
}