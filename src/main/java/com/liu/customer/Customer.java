package com.liu.customer;

public class Customer {
    String name;
    int price;
    float discount;
    float off=0.1f;
    public Customer(String name,int price){
        this.name=name;
        this.price=price;
    }
    public float discount(){
        return discount=price-(price/1000)*off*1000;
    }
    public void print(){
        if(price>=1000)
        System.out.print(name+"\t"+price+"\t"+discount());
        else
            System.out.print(name+"\t"+price+" \t"+price);
    }
}
