package com.example.yg.cheongwon;

import android.util.Log;

public class Content_ItemLIst {

    private String no_num;
    private String look_num;
    private String subject_text;

    public String getNo_num() {
        return no_num;
    }

    public void setNo_num(String no_num) {
        this.no_num = no_num;
    }



    public String getLook_num() {

        return look_num;
    }

    public void setLook_num(String look_num) {
        this.look_num = look_num;
    }

    public String getSubject_text() {
        return subject_text;
    }

    public void setSubject_text(String subject_text) {
        this.subject_text = subject_text;
    }
    public Content_ItemLIst(String no_num, String subject_text, String look_num ) {
        this.no_num = no_num;
        this.look_num = look_num;
        this.subject_text = subject_text;
        Log.d("item", "construct");
    }
}