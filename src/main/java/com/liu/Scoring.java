package com.liu;

public class Scoring {
    public static void main(String[] args) {
        Students Jack=new Students("Jack");
        //Jack.names="Jack";
        Jack.english=70;
        Jack.math=85;
        Students Hank=new Students("Hank",60,30);
        Students s=new Students();
        Graduate Jane=new Graduate();
        Jane.names="Jane";
        Jack.print();
        Hank.print();
        Jane.print();
    }
}
