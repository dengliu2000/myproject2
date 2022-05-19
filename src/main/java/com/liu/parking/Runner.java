package com.liu.parking;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String enterTime="08:00";
        String exitTime="11:59";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date d=null;
        try{
            d=sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins=(int)((d2.getTime()- d.getTime())/1000/60);
            System.out.println(mins);
            if (mins%60>=15 && mins%60<=30){
                int fee=15+30*(mins/60);
                System.out.println("Fee:"+fee);
            }
            else if(mins%60>=31 && mins%60<=59){
            int fee=30+30*(mins/60);
            System.out.println("Fee:"+fee);}
            else {
                int fee=30*(mins/60);
                System.out.println("Fee:"+fee);
            }
        }catch (Exception e){
            System.out.println("exit wrong format");
        }

    }
}
