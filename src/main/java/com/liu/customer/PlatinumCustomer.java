package com.liu.customer;

public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer(String name,int price){
        super(name,price);
        off=0.3f;
    }
}
