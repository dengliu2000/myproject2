package com.liu;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String name,int price){
        super(name,price);
        off=200;
    }
}
