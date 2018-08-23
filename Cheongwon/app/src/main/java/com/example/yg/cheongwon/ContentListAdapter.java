package com.example.yg.cheongwon;

import android.util.Log;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;

import com.example.yg.cheongwon.R;

import java.lang.*;
import java.util.ArrayList;

public class ContentListAdapter extends BaseAdapter {
    Context context;
    ArrayList<Content_ItemLIst> itemArrayList;

    TextView no_num;
    TextView look_num;
    TextView subject_text;


    public ContentListAdapter(Context context, ArrayList<Content_ItemLIst> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;

        Log.d("adapter", "view");
    }

    @Override
    public int getCount() {
        return this.itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.content_item, null);
            no_num = (TextView) convertView.findViewById(R.id.no_num);
            look_num = (TextView) convertView.findViewById(R.id.look_num);
            subject_text = (TextView) convertView.findViewById(R.id.subject_text);
        }

        no_num.setText(itemArrayList.get(position).getNo_num());
        subject_text.setText(itemArrayList.get(position).getSubject_text());
        look_num.setText(itemArrayList.get(position).getLook_num());
        return convertView;
    }


}
