package com.liu.sales;

public class Customer {
    String name;
    int price;
    float discount;
    float off=0.1f;
    public Customer(String name,int price){
        this.name=name;
        this.price=price;
    }
    public float backmoney(){
        return (price/1000)*off*1000;
    }
    public void print(){
        if(price>=1000)
        System.out.print(name+"\t"+price+"\t"+(price-backmoney()));
        else
            System.out.print(name+"\t"+price+" \t"+price);
    }
}
