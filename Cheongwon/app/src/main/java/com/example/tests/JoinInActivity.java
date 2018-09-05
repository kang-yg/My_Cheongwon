package com.example.tests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class JoinInActivity extends Activity { //회원가입(팝업창으로)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //팝업창띄울때 상단바 없애는거
        setContentView(R.layout.activity_main);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        double width=dm.widthPixels;
        double height=dm.heightPixels;

        getWindow().setLayout((int)(width*1),(int)(height*0.8));

        Button commitButton = findViewById(R.id.JoinIn);
        commitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), R.string.success_joinin,Toast.LENGTH_LONG).show();
                startActivity(goLogin);
                finish();
            }
        });
    }
}
