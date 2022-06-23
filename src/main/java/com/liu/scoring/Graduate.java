package com.liu.scoring;

public class Graduate extends Students implements Printable{
    int thesis;
    public Graduate(String names,int english,
                    int math,int thesis){
        super(names, english, math);
        this.thesis=thesis;
    }
    @Override
    public void print(){
        System.out.println(names+"\t"+english+"\t"+math+"\t"+getAverage()+"\t"+thesis);
    }
}
