package com.liu;

public class Students {
    String names;
    int english;
    int math;
    public Students(String names){
        this.names=names;
    }
    public Students(String names,int english,int math){
        this.names=names;
        this.english=english;
        this.math=math;
    }
    public void print(){
        System.out.println(names+"\t"+english+"\t"+math+"\t");
    }
}
