package com.liu.sales;

import com.liu.sales.Customer;

public class SilverCustomer extends Customer {
    public SilverCustomer(String name,int price){
        super(name,price);
    }
    public void print() {
        if(price>=1000) {
            System.out.print(name + "\t" + price +"\t"+ (price-backmoney()) + "(" + backmoney() + ")");
        }
        else{
            System.out.print(name + "\t" + price + " \t" + price);
        }
    }
}
