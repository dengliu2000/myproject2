package com.liu.ticket;

public class Station {
    public static final Station TAIPEI_STATION=new Station(100,);
    public static final Station TAICHUNG_STATION=new Station();
    public static final Station KAOHSIUNG_STATION=new Station();
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
