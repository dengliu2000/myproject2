package com.liu.scoring;

public class Students implements Printable{
    public String names;
    int english;
    int math;
    public Students(String names,int english,int math){
        this.names=names;
        this.english=english;
        this.math=math;
    }

    @Override
    public void print() {
        System.out.print(names+"\t"+english+"\t"+math+"\t"+getAverage());
        if (getAverage()<60)
            System.out.print("*");
        System.out.println();
    }

    public Students(){
        this("John Doe",-1,-1);
    }
    /*public void print(){
        System.out.print(names+"\t"+english+"\t"+math+"\t"+getAverage());
        if (getAverage()<60)
            System.out.print("*");
        System.out.println();
    }*/
    public int getAverage(){
        return (math+english)/2;
    }
}
