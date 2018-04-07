package com.govinddixit.hackernews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Credits extends AppCompatActivity {
    public TextView textView;
    public Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        animation= AnimationUtils.loadAnimation(this,R.anim.credits);

        textView=findViewById(R.id.textView2);
        textView.setText("CREATOR :- \n\n"+"GOVIND DIXIT");
        textView.startAnimation(animation);

    }
}
