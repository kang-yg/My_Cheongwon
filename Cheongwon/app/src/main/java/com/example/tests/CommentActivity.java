package com.example.tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;


import static com.example.tests.Comment_ItemList.cementum;

public class CommentActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment);

        Button clickGood = findViewById(R.id.goodButton);
        final TextView countGood = findViewById(R.id.countGood);

        Log.d("댓글 액티비티","댓글 액티비티 실행");

        ListView commentListView = findViewById(R.id.commentListView);
        CommentListAdapter commentListAdapter;
        final ArrayList<Comment_ItemList> listCommentItem= new ArrayList<Comment_ItemList>();

        listCommentItem.add(0,new Comment_ItemList("글쓴이01", new Date(System.currentTimeMillis()), "내용01", "0", "0"));
        listCommentItem.add(1,new Comment_ItemList("글쓴이02", new Date(System.currentTimeMillis()), "내용02","0","0"));
        /*  listCommentItem.add(cementum=2,new Comment_ItemList("글쓴이03", new Date(System.currentTimeMillis()), "내용03","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이04", new Date(System.currentTimeMillis()), "내용04","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이05", new Date(System.currentTimeMillis()), "내용05","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이06", new Date(System.currentTimeMillis()), "내용06","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이07", new Date(System.currentTimeMillis()), "내용07","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이08", new Date(System.currentTimeMillis()), "내용08","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이09", new Date(System.currentTimeMillis()), "내용09","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이10", new Date(System.currentTimeMillis()), "내용10","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이11", new Date(System.currentTimeMillis()), "내용11","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이12", new Date(System.currentTimeMillis()), "내용12","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이13", new Date(System.currentTimeMillis()), "내용13","0","0"));
        listCommentItem.add(new Comment_ItemList("글쓴이14", new Date(System.currentTimeMillis()), "내용14","0","0"));*/
        commentListAdapter= new CommentListAdapter(CommentActivity.this, listCommentItem);
        commentListView.setAdapter(commentListAdapter);
    }

}
