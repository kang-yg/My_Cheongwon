package com.example.tests;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;
import android.app.Activity;

public class Activity_map extends AppCompatActivity {
    private TextView mTextMessage;
    public int a=1;//로그인여부
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent goMapIntent = new Intent(getApplicationContext(), Activity_map.class);
                    startActivity(goMapIntent);
                    finish();
                    return true;
                case R.id.navigation_dashboard:
                    Intent contentList = new Intent(getApplicationContext(), ContentActivity.class);
                    startActivity(contentList);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    if(a==0){    //로그인됨
                        Intent goMyInfo = new Intent(getApplicationContext(), MyInfoActivity.class);
                        startActivity(goMyInfo);
                        finish();
                        return true;
                    }
                    else if(a==1){
                        startActivity(new Intent(Activity_map.this, MainActivity.class));
                        a=0;
                        return true;
                    }
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        BottomNavigationView navigation=(BottomNavigationView)findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
