package com.liu.customer;

public class CustomerLevel {
    public static void main(String[] args) {
        Customer c1=new Customer("001",1500);
        Customer c2=new Customer("002",500);
        SilverCustomer c3=new SilverCustomer("003",1500);
        GoldenCustomer c4=new GoldenCustomer("004",5000);
        PlatinumCustomer c5=new PlatinumCustomer("005",6000);
        c1.print();
        System.out.println();
        c2.print();
        System.out.println();
        c3.print();
        System.out.println();
        c4.print();
        System.out.println();
        c5.print();
    }
}
