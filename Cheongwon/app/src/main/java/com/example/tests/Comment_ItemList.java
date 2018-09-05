package com.example.tests;

import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class Comment_ItemList {
    ArrayList<String> list1;
    private String commentName;
    private Date commentDate;
    private String commentContent;
    private String commentCountGood;
    private String commentCountBad;
   public static int cementum =0;

    public Comment_ItemList(String commentName,Date commentDate,String commentContent,String commentCountGood,String commentCountBad){
        this.commentName=commentName;
        this.commentDate=commentDate;
        this.commentContent=commentContent;
        this.commentCountGood=commentCountGood;
        this.commentCountBad=commentCountBad;

    }

    public String getCommentName(){
        return commentName;
    }

    public void setCommentName(String commentName){
        this.commentName=commentName;
    }

    public Date getCommentDate(){
        return commentDate;
    }

    public void setCommentDate(Date commentDate){
        this.commentDate=commentDate;
    }

    public String getCommentContent(){
        return commentContent;
    }

    public void setCommentContent(String commentContent){
        this.commentContent=commentContent;
    }

    public String getCommentCountGood(){
        return commentCountGood;
    }

    public void setCommentCountGood(String commentCountGood){
        this.commentCountGood=commentCountGood;
    }

    public String getCommentCountBad(){
        return commentCountBad;
    }

    public void setCommentCountBad(String commentCountBad){
        this.commentCountBad=commentCountBad;
    }

    public void clickGoodButton() {
        int temp = Integer.parseInt(getCommentCountGood()) + 1;
        setCommentCountGood(Integer.toString(temp));
        Log.d("나 눌렸어","눌렸다고");
    }
}
