package com.liu;

public class Customer {
    String name;
    int price;
    public Customer(String name){
        this.name=name;
    }
    public Customer(String name,int price){
        this(name);
        this.price=price;
    }
    public void print(){
        if(price>=1000)
        System.out.print(name+"\t"+price+"\t"+(price-(price/1000)*100));
        else
            System.out.print(name+"\t"+price+" \t"+price);
    }
}
