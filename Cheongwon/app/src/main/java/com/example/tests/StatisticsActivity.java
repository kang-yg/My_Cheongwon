package com.example.tests;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class StatisticsActivity extends AppCompatActivity{
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        PieChart pieChart01=(PieChart)findViewById(R.id.piechart01);
        PieChart pieChart02=(PieChart)findViewById(R.id.piechart02);

        //Circle Chart 01
        pieChart01.setUsePercentValues(true);
        pieChart01.getDescription().setEnabled(false);
        pieChart01.setExtraOffsets(5,10,5,5);

        pieChart01.setDragDecelerationFrictionCoef(0.95f);

        pieChart01.setDrawHoleEnabled(false);
        pieChart01.setHoleColor(Color.WHITE);
        pieChart01.setTransparentCircleRadius(61f);

        ArrayList<PieEntry>yValues01=new ArrayList<PieEntry>();

        yValues01.add(new PieEntry(20,"10대"));
        yValues01.add(new PieEntry(10,"20대"));
        yValues01.add(new PieEntry(30,"30대"));
        yValues01.add(new PieEntry(10,"40대"));
        yValues01.add(new PieEntry(20,"50대"));
        yValues01.add(new PieEntry(20,"60대"));

        Description description01=new Description();
        description01.setText("나이별 댓글수");   //라벨
        description01.setTextSize(15);
        pieChart01.setDescription(description01);

        pieChart01.animateY(1000,Easing.EasingOption.EaseInOutCubic);   //애니메이션
        PieDataSet dataSet01=new PieDataSet(yValues01,"나이별 댓글수");
        dataSet01.setSliceSpace(3f);
        dataSet01.setSelectionShift(5f);
        dataSet01.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData circleData01=new PieData(dataSet01);
        circleData01.setValueTextSize(10f);
        circleData01.setValueTextColor(Color.YELLOW);

        pieChart01.setData(circleData01);

        //Circle Chart02
        pieChart02.setUsePercentValues(true);
        pieChart02.getDescription().setEnabled(false);
        pieChart02.setExtraOffsets(5,10,5,5);

        pieChart02.setDragDecelerationFrictionCoef(0.95f);

        pieChart02.setDrawHoleEnabled(false);
        pieChart02.setHoleColor(Color.WHITE);
        pieChart02.setTransparentCircleRadius(61f);

        ArrayList<PieEntry>yValues02=new ArrayList<PieEntry>();

        yValues02.add(new PieEntry(50,"찬성"));
        yValues02.add(new PieEntry(50,"반대"));

        Description description02=new Description();
        description02.setText("찬성/반대"); //라벨
        description02.setTextSize(15);
        pieChart02.setDescription(description02);

        pieChart02.animateY(1000,Easing.EasingOption.EaseInOutCubic);   //애니메이션

        PieDataSet dataSet02=new PieDataSet(yValues02,"찬성/반대");
        dataSet02.setSliceSpace(3f);
        dataSet02.setSelectionShift(5f);
        dataSet02.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData circleData02=new PieData(dataSet02);
        circleData02.setValueTextSize(10f);
        circleData02.setValueTextColor(Color.YELLOW);

        pieChart02.setData(circleData02);
    }
}
