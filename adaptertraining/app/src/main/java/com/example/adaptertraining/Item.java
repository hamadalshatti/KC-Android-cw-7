package com.example.adaptertraining;

public class Item {
    String flightname;
    int flightimage ;
    double flightprice;

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public int getFlightimage() {
        return flightimage;
    }

    public void setFlightimage(int flightimage) {
        this.flightimage = flightimage;
    }

    public double getFlightprice() {
        return flightprice;
    }

    public void setFlightprice(double flightprice) {
        this.flightprice = flightprice;
    }

    public Item(String flightname, int flightimage, double flightprice) {
        this.flightname = flightname;
        this.flightimage = flightimage;
        this.flightprice = flightprice;

    }
}
