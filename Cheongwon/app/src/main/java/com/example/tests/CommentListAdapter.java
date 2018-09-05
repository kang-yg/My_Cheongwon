package com.example.tests;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.tests.Comment_ItemList.cementum;

public class CommentListAdapter extends BaseAdapter {
    Context context;
    ArrayList<Comment_ItemList> list_CommentArray;

    TextView nameTextView;
    TextView dateTextView;
    TextView contentTextView;
    TextView countGood; //좋아요수
    TextView countBad;  //싫어요수

    Button goodButton;
    Button badButton;

    public CommentListAdapter(Context context, ArrayList<Comment_ItemList> list_CommentArray) {
        this.context = context;
        this.list_CommentArray = list_CommentArray;
    }

    @Override
    public int getCount() {
        Log.d("getCount", "실행");
        return this.list_CommentArray.size();
    }

    @Override
    public Object getItem(int position) {
        Log.d("getItem", "실행");
        return this.list_CommentArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        Log.d("getItemId", "실행");
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        Log.d("getView", "실행");
        if (convertView == null) {
            Log.d("getView", "if true");
            convertView = LayoutInflater.from(context).inflate(R.layout.comment_item, null);
        }
        //connect widget
        nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        dateTextView = (TextView) convertView.findViewById(R.id.dateTextView);
        contentTextView = (TextView) convertView.findViewById(R.id.contentTextView);
        countGood = (TextView) convertView.findViewById(R.id.countGood);
        countBad = (TextView) convertView.findViewById(R.id.countBad);
        goodButton = (Button) convertView.findViewById(R.id.goodButton);
        goodButton.setTag(position);
        badButton = (Button) convertView.findViewById(R.id.badButton);

        //TextView.setText
        nameTextView.setText(list_CommentArray.get(position).getCommentName());
        dateTextView.setText(list_CommentArray.get(position).getCommentDate().toString());
        contentTextView.setText(list_CommentArray.get(position).getCommentContent());
        countBad.setText(list_CommentArray.get(position).getCommentCountBad());
        countGood.setText(list_CommentArray.get(position).getCommentCountGood()); //누적되는값을 countGood에 넣어서 보여줄거야.

        //click good or bad button
        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = (Integer) v.getTag();
                list_CommentArray.get(position).clickGoodButton();    //숫자가 해당 cementum에서 올라가

                // list_CommentArray.set(position, getCommentCountGood());

                countGood.setText(list_CommentArray.get(position).getCommentCountGood()); //누적되는값을 countGood에 넣어서 보여줄거야.
                //list_CommentArray.get(position).getCommentCountGood(); //이부분이 마지막아이템에 누적됨.
                Log.d("good button", Integer.toString(position));
                Toast.makeText(context, "좋아요 클릭", Toast.LENGTH_SHORT).show();
            }
        });
               /* if (cementum == ) {
                    countGood.setText(list_CommentArray.get(position).getCommentCountGood()); //이부분이 마지막아이템에 누적됨.
                    Toast.makeText(context, "좋아요 클릭", Toast.LENGTH_SHORT).show();

                }*/


        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countBad.setText(list_CommentArray.get(position).getCommentCountBad() + 1);
                Toast.makeText(context, "싫어요 클릭", Toast.LENGTH_SHORT).show();
            }
        });
        Log.d("getView", "if false");
        return convertView;
    }

}
