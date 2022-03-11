package com.liu;

public class Students {
    String names;
    int english;
    int math;
    public Students(String names){
        this.names=names;
    }
    public Students(String names,int english,int math){
        this(names);
        //this.names=names;
        this.english=english;
        this.math=math;
    }
    public Students(){
        this("John Doe",-1,-1);
    }
    public void print(){
        System.out.println(names+"\t"+english+"\t"+math+"\t");
    }
}
