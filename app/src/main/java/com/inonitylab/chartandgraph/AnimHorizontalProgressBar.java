package com.inonitylab.chartandgraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daasuu.ahp.AnimateHorizontalProgressBar;

public class AnimHorizontalProgressBar extends AppCompatActivity {

    /*
    *dependency : compile 'com.daasuu:animateHorizontalProgressBar:0.2.4'
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_horizontal_progress_bar);

        AnimateHorizontalProgressBar progressBar = (AnimateHorizontalProgressBar) findViewById(R.id.animate_progress_bar);
        progressBar.setMax(1000);
       // progressBar.setProgress(400);
       // progressBar.setMaxWithAnim(2000);
        progressBar.setProgressWithAnim(800);
    }
}
