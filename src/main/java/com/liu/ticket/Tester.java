package com.liu.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei, 2:Taichung, 3:Kaohsiung)");
        int choice=Integer.parseInt(scanner.next());
        Station start=null;
        switch (choice){
            case 1:
                start=Station.TAIPEI_STATION;
                break;
            case 2:
                start=Station.TAICHUNG_STATION;
                break;
            case 3:
                start=Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your destination station?(1:Taipei, 2:Taichung, 3:Kaohsiung)");
        choice=Integer.parseInt(scanner.next());
        Station end=null;
        switch (choice){
            case 1:
                end=Station.TAIPEI_STATION;
                break;
            case 2:
                end=Station.TAICHUNG_STATION;
                break;
            case 3:
                end=Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("What kind of ticket?(1:normal, 2:student, 3:older)");
        choice=Integer.parseInt(scanner.next());
        Ticket ticket=null;
        switch (choice){
            case 1:
                Ticket.print();
                break;
            case 2:
                StudentTicket.print();
                break;
            case 3:
                OlderTicket.print();
                break;
        }
    }
}
