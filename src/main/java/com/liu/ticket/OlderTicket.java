package com.liu.ticket;

public class OlderTicket extends StudentTicket{
    public OlderTicket(Station start,Station destination){
        super(start,destination);
        off=0.5f;
    }
}
