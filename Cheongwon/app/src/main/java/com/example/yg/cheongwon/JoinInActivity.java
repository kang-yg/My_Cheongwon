package com.example.yg.cheongwon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JoinInActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button commitButton = findViewById(R.id.JoinIn);
        commitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(),R.string.success_joinin,Toast.LENGTH_LONG).show();
                startActivity(goLogin);
            }
        });



    }
}
