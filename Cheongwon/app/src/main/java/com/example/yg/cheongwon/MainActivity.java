package com.example.yg.cheongwon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //activity_login

        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplicationContext(),Activity_map.class);
                startActivity(loginIntent);
            }
        });

       Button joinInButton = findViewById(R.id.JoinIn);
        joinInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joininIntent = new Intent(getApplicationContext(), JoinInActivity.class);
                startActivity(joininIntent);
            }
        });

    }
}
