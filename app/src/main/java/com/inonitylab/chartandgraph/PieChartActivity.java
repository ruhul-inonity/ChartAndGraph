package com.inonitylab.chartandgraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        pieChart = (PieChart) findViewById(R.id.piChart);

        //skeleton of chart
        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry(4805f, "Blue"));
        entries.add(new PieEntry(2600f, "Gray"));
        entries.add(new PieEntry(2460f, "Green"));
        entries.add(new PieEntry(208f, "Yellow"));
        entries.add(new PieEntry(500f, "Red"));
        entries.add(new PieEntry(2550f, "GRAY"));
        entries.add(new PieEntry(1250f, "DKGRAY"));

        PieDataSet set = new PieDataSet(entries, "Various colors");

        pieChart.setCenterText("Hello Sweet Centre");

        //add color to chart
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.BLUE);
        colors.add(Color.GRAY);
        colors.add(Color.GREEN);
        colors.add(Color.DKGRAY);
        colors.add(Color.CYAN);
        colors.add(Color.LTGRAY);
        colors.add(Color.MAGENTA);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);
        set.setColors(colors);

        Log.d("color",Color.BLUE + "................. "+ colors.get(2));

        //spacing between slices
        set.setSliceSpace(4);

        //add legend to chart
        Legend legend = pieChart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);


        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.invalidate(); // refresh

        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Log.d("chart value selected e"," ......................... "+e.toString());
                Log.d("chart value selected h"," ......................... "+h.toString());
                Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });

    }
}
