package com.liu;

public class Customer {
    String name;
    int price;
    int discount;
    int off=100;
    public Customer(String name){
        this.name=name;
    }
    public Customer(String name,int price){
        this(name);
        this.price=price;
    }
    public int discount(){
        return discount=price-(price/1000)*off;
    }
    public void print(){
        if(price>=1000)
        System.out.print(name+"\t"+price+"\t"+discount());
        else
            System.out.print(name+"\t"+price+" \t"+price);
    }
}
