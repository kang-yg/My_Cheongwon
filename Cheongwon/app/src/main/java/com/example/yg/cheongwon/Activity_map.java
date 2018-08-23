package com.example.yg.cheongwon;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity_map extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent goMapIntent = new Intent(getApplicationContext(),Activity_map.class);startActivity(goMapIntent);
                    return true;
                case R.id.navigation_dashboard:
                    Intent contentList = new Intent(getApplicationContext(),ContentActivity.class);
                    startActivity(contentList);
                    return true;
                case R.id.navigation_notifications:
                    Intent goMyInfo = new Intent(getApplicationContext(),MyInfoActivity.class);
                    startActivity(goMyInfo);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
