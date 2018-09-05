package com.example.tests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LogoActivity extends Activity {        //시작후 앱 로고 2초띄우기
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.logo);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      /*  Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();       // 2 초후 이미지를 닫아버림
            }
        }, 2000);
*/
        startActivity(new Intent(this,Activity_map.class));
        finish();
    }
}
