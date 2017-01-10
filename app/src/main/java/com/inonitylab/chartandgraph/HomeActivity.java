package com.inonitylab.chartandgraph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void pieChart(View view){
        Intent intent = new Intent(HomeActivity.this,PieChartActivity.class);
        startActivity(intent);
    }

    public void horizontalBarChart(View view){
        Intent intent = new Intent(HomeActivity.this,HorizontalBarChartActivity.class);
        startActivity(intent);
    }
    public void animateHorizontalProgressBar(View view){
        Intent intent = new Intent(HomeActivity.this,AnimHorizontalProgressBar.class);
        startActivity(intent);
    }
}
