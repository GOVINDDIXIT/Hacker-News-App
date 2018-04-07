package com.govinddixit.hackernews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class welcomePage extends AppCompatActivity {
    LinearLayout l1, l2;
    Button btn,btn1;
    Animation uptodown;
    Animation downtoup;

    public void Enter(View view)
    {
        Intent intent = new Intent(welcomePage.this, MainActivity.class);
        startActivity(intent);
    }
    public void Credits(View view)
    {
        Intent intent=new Intent(welcomePage.this,Credits.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
    }
}