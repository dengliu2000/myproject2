package com.liu.scoring;

import com.liu.customer.Customer;
import com.liu.customer.GoldenCustomer;
import com.liu.customer.PlatinumCustomer;
import com.liu.customer.SilverCustomer;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Jack",70,85));
        students.add(new Students("Hank", 60, 30));
        students.add(new Graduate("Jane", 81, 80, 79));
        students.add(new Students());
        for (Students s : students) {
            s.print();
            System.out.println();
        }
    }
}
