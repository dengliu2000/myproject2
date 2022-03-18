package com.liu;

import javax.swing.*;

public class SilverCustomer extends Customer {
    int discount;
    public SilverCustomer(String name,int price){
        super(name,price);
    }
    public void print() {
        if(price>=1000) {
            discount = (price / 1000) * 100;
            System.out.print(name + "\t" + price +"\t"+ (price - (price / 1000) * 100) + "(" + discount + ")");
        }
        else{
            System.out.print(name + "\t" + price + " \t" + price);
        }
    }
}
