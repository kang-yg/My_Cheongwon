package com.example.yg.cheongwon;

import android.widget.Button;

import java.util.Date;

public class Comment_ItemList {
    private String commentName;
    private Date commentDate;
    private String commentContent;
    private String commentCountGood;
    private String commentCountBad;

    public Comment_ItemList(String commentName, Date commentDate, String commentContent, String commentCountGood, String commentCountBad) {
        this.commentName = commentName;
        this.commentDate = commentDate;
        this.commentContent = commentContent;
        this.commentCountGood = commentCountGood;
        this.commentCountBad = commentCountBad;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentCountGood() {
        return commentCountGood;
    }

    public void setCommentCountGood(String commentCountGood) {
        this.commentCountGood = commentCountGood;
    }

    public String getCommentCountBad() {
        return commentCountBad;
    }

    public void setCommentCountBad(String commentCountBad) {
        this.commentCountBad = commentCountBad;
    }
}
