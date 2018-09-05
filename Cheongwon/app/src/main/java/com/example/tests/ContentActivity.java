package com.example.tests;

import android.content.Intent;

import com.github.clans.fab.FloatingActionButton;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.tests.ContentListAdapter;
import com.example.tests.Content_ItemList;
import com.example.tests.MainActivity;
import com.example.tests.R;
import com.github.clans.fab.FloatingActionMenu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class ContentActivity extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public int a=1;
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
                        startActivity(new Intent(ContentActivity.this, MainActivity.class));
                        a=0;
                        return true;
                    }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Log.d("listes", "onCreate");

        //Add content item and show content list
        ListView commentListView = findViewById(R.id.views);
        ContentListAdapter viewAdapters;
        final ArrayList<Content_ItemList> listview;

        listview = new ArrayList<Content_ItemList>();
        listview.add(new Content_ItemList("1", "제목1", "0"));
        listview.add(new Content_ItemList("2", "제목2", "0"));
        listview.add(new Content_ItemList("3", "제목3", "0"));
        listview.add(new Content_ItemList("4", "제목4", "0"));
        /*listview.add(new Item(5,"제목5",0));
        listview.add(new Item(6,"제목2",0));
        listview.add(new Item(7,"제목3",0));
        listview.add(new Item(8,"제목2",0));
        listview.add(new Item(9,"제목3",0));
        listview.add(new Item(10,"제목2",0));
        listview.add(new Item(11,"제목3",0));*/
        viewAdapters = new ContentListAdapter(ContentActivity.this, listview);
        commentListView.setAdapter(viewAdapters);

/*        commentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go_content = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(go_content);
                Log.d("click content item", listview.get(0).getNo_num());
            }
        });*/


        //FloatingButton
        FloatingActionMenu materialDesignFAM;
        FloatingActionButton floatingActionButton1;

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goWriteContent = new Intent(getApplicationContext(), WriteActivity.class);
                startActivity(goWriteContent);
                finish();
            }
        });

        //ListItemClick
        try {
            commentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView parent, View v, int position, long id) {
                    Intent readContentIntent = new Intent(getApplicationContext(), ReadContentActivity.class);
                    //Enter data to forward
                    readContentIntent.putExtra("subject",listview.get(position).getSubject_text());
                    startActivity(readContentIntent);
                    finish();
                }
            });
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
