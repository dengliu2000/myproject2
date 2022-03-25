package com.liu.customer;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String name,int price){
        super(name,price);
        off=200;
    }
}
