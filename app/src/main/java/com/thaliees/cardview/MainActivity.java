package com.thaliees.cardview;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private CardView business;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        business = findViewById(R.id.business);
        animation();
    }

    private void animation(){
        // Animation will show the card, using the property alpha
        // Initialize range of values
        final ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
        // Indicate the duration
        animator.setDuration(5000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float x = (float) animator.getAnimatedValue();
                business.setAlpha(x);
            }
        });
        animator.start();
    }
}
