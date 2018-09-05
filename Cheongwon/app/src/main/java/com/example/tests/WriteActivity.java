package com.example.tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WriteActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_cheongwon);

        Button writeButton=findViewById(R.id.write_commit);
        writeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),R.string.success_write,Toast.LENGTH_LONG).show();
                Intent backContentList = new Intent(getApplicationContext(),ContentActivity.class);
                startActivity(backContentList);
                finish();
            }
        });
    }
}
