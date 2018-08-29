package com.example.yg.cheongwon;

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

import com.example.yg.cheongwon.ContentListAdapter;
import com.example.yg.cheongwon.Content_ItemLIst;
import com.example.yg.cheongwon.MainActivity;
import com.example.yg.cheongwon.R;
import com.github.clans.fab.FloatingActionMenu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public class ContentActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent goMapIntent = new Intent(getApplicationContext(), Activity_map.class);
                    startActivity(goMapIntent);
                    return true;
                case R.id.navigation_dashboard:
                    Intent contentList = new Intent(getApplicationContext(), ContentActivity.class);
                    startActivity(contentList);
                    return true;
                case R.id.navigation_notifications:
                    Intent goMyInfo = new Intent(getApplicationContext(), MyInfoActivity.class);
                    startActivity(goMyInfo);
                    return true;
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

/*        ViewGroup best01 = (ViewGroup) findViewById(R.id.firstBestComment);
        best01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReadContent = new Intent(getApplicationContext(),ReadContentActivity.class);
                startActivity(goReadContent);
            }
        });*/

        ListView commentListView = findViewById(R.id.views);
        ContentListAdapter viewAdapters;
        ArrayList<Content_ItemLIst> listview;

        listview = new ArrayList<Content_ItemLIst>();
        listview.add(new Content_ItemLIst("1", "제목1", "0"));
        listview.add(new Content_ItemLIst("2", "제목2", "0"));
        listview.add(new Content_ItemLIst("3", "제목3", "0"));
        listview.add(new Content_ItemLIst("4", "제목4", "0"));
        /*listview.add(new Item(5,"제목5",0));
        listview.add(new Item(6,"제목2",0));
        listview.add(new Item(7,"제목3",0));
        listview.add(new Item(8,"제목2",0));
        listview.add(new Item(9,"제목3",0));
        listview.add(new Item(10,"제목2",0));
        listview.add(new Item(11,"제목3",0));*/
        viewAdapters = new ContentListAdapter(ContentActivity.this, listview);
        commentListView.setAdapter(viewAdapters);

        commentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go_content = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(go_content);
            }
        });

        FloatingActionMenu materialDesignFAM;
        FloatingActionButton floatingActionButton1;

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goWriteContent = new Intent(getApplicationContext(), WriteActivity.class);
                startActivity(goWriteContent);
            }
        });
    }
}
