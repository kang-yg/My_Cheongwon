package com.example.tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyInfoActivity extends AppCompatActivity {     //정보변경
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        public int a = 1;

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
                    if (a == 0) {    //로그인됨
                        Intent goMyInfo = new Intent(getApplicationContext(), MyInfoActivity.class);
                        startActivity(goMyInfo);
                        finish();
                        return true;
                    } else if (a == 1) {
                        startActivity(new Intent(MyInfoActivity.this, MainActivity.class));
                        a = 0;
                        finish();
                        return true;
                    }
            }
            return false;
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Button changeMyInfo = findViewById(R.id.changeMyInfo);
        changeMyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.change_myInfo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
