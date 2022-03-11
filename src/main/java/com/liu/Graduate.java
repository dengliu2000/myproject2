package com.liu;

public class Graduate extends Students {
    int thesis;
    public Graduate(String names,int english,
                    int math,int thesis){
        super(names, english, math);
        this.thesis=thesis;
    }
}
