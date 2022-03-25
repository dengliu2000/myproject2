package com.liu.scoring;

public class Scoring {
    public static void main(String[] args) {
        Students Jack=new Students("Jack");
        //Jack.names="Jack";
        Jack.english=70;
        Jack.math=85;
        Students Hank=new Students("Hank",60,30);
        Graduate Jane=new Graduate("Jane",81,80,79);
        Jack.print();
        Hank.print();
        Jane.print();
    }
}
