package com.example.yg.cheongwon;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yg.cheongwon.ContentListAdapter;
import com.example.yg.cheongwon.Content_ItemLIst;
import com.example.yg.cheongwon.MainActivity;
import com.example.yg.cheongwon.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public class ContentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        Log.d("listes", "onCreate");

/*        ViewGroup best01 = (ViewGroup) findViewById(R.id.firstBestComment);
        best01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReadContent = new Intent(getApplicationContext(),ReadContentActivity.class);
                startActivity(goReadContent);
            }
        });*/

        FloatingActionButton fab = findViewById(R.id.fab);
        ListView commentListView=findViewById(R.id.views);
        ContentListAdapter viewAdapters;
        ArrayList<Content_ItemLIst> listview;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goWriteContent = new Intent(getApplicationContext(),WriteActivity.class);
                startActivity(goWriteContent);
            }
        });

        listview=new ArrayList<Content_ItemLIst>();
        listview.add(new Content_ItemLIst("1","제목1","0"));
        listview.add(new Content_ItemLIst("2","제목2","0"));
        listview.add(new Content_ItemLIst("3","제목3","0"));
        listview.add(new Content_ItemLIst("4","제목4","0"));
        /*listview.add(new Item(5,"제목5",0));
        listview.add(new Item(6,"제목2",0));
        listview.add(new Item(7,"제목3",0));
        listview.add(new Item(8,"제목2",0));
        listview.add(new Item(9,"제목3",0));
        listview.add(new Item(10,"제목2",0));
        listview.add(new Item(11,"제목3",0));*/
        viewAdapters=new ContentListAdapter(ContentActivity.this, listview);
        commentListView.setAdapter(viewAdapters);

        commentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go_content = new Intent(ContentActivity.this,MainActivity.class);
                startActivity(go_content);
            }
        });
    }

}
