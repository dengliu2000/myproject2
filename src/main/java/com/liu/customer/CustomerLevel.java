package com.liu.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLevel {
    public static void main(String[] args) {
        List<Customer>customers= new ArrayList<>();
        customers.add(new Customer("001",1500));
        customers.add(new Customer("002",500));
        customers.add(new SilverCustomer("003",1500));
        customers.add(new GoldenCustomer("004",5000));
        customers.add(new PlatinumCustomer("005",6000));
        for(Customer c: customers){
            c.print();
            System.out.println();
        }
    }
}
