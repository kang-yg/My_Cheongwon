package com.example.yg.cheongwon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yg.cheongwon.R;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class ReadContentActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();   // 현재시간을 msec형식으로 함
    Date date = new Date(now); // 현재시간을 date 변수에 저장
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String formatDate = sdfNow.format(date);   // nowDate 변수에 값을 저장

    TextView dateNow;
    TextView datelater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_content);

        TextView subText = findViewById(R.id.subject1);

        //Get content item info
        Intent getter = getIntent();
        int no_num;
        String subuject_text;
        int look_num;

        subuject_text = getter.getStringExtra("subject");
        subText.setText(subuject_text);

        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);    // TextView 에 현재 시간 문자열 할당

        Button agree = findViewById(R.id.yes); //찬성
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button disagree = findViewById(R.id.no); //반대
        disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button sta = findViewById(R.id.statistics);//통계보기
        sta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStatistics = new Intent(getApplicationContext(), StatisticsActivity.class);
                startActivity(goStatistics);
            }
        });

        Button readCommnet = findViewById(R.id.comment);
        readCommnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReadComment = new Intent(getApplicationContext(), CommentActivity.class);
                startActivity(goReadComment);
            }
        });

        //한달후
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, +1);
        Date currentTime = cal.getTime();
        sdfNow = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String depart = sdfNow.format(currentTime);
        datelater = (TextView) findViewById(R.id.datelater);
        datelater.setText(depart);
    }

}
