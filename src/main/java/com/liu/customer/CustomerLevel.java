package com.liu.customer;

public class CustomerLevel {
    public static void main(String[] args) {
        Customer John=new Customer("John");
        John.price=1500;
        Customer Josh=new Customer("Josh");
        Josh.price=500;
        SilverCustomer Hank=new SilverCustomer("Hank",1500);
        GoldenCustomer Frank=new GoldenCustomer("Frank",5000);
        John.print();
        System.out.println();
        Hank.print();
        System.out.println();
        Josh.print();
        System.out.println();
        Frank.print();
    }
}
