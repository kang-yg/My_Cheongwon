package com.example.tests;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
*/

public class MainActivity extends Activity {   //로그인+회원가입화면(팝업창으로)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);    //activity_login

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        double width=dm.widthPixels;
        double height=dm.heightPixels;

        getWindow().setLayout((int)(width*1),(int)(height*0.8));

        Button loginButton=findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
            Intent loginIntent=new Intent(getApplicationContext(),MyInfoActivity.class);  //정보변경으로 돌아가면서 로그인완료
            startActivity(loginIntent);
            finish();   //화면쌓이지않게함.
           }
        });

        Button joinInButton=findViewById(R.id.JoinIn);
        joinInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent joinIntent=new Intent(getApplicationContext(),JoinInActivity.class);
                startActivity(joinIntent);
                finish();
            }
        });
    }
}

