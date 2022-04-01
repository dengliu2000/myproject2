package com.liu.customer;

public class SilverCustomer extends Customer {
    public SilverCustomer(String name,int price){
        super(name,price);
    }
    public float backmoney(){
        return (price/1000)*off*1000;
    }
    public void print() {
        if(price>=1000) {
            System.out.print(name + "\t" + price +"\t"+ discount() + "(" + backmoney() + ")");
        }
        else{
            System.out.print(name + "\t" + price + " \t" + price);
        }
    }
}
