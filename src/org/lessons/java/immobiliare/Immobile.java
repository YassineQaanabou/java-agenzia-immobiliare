package org.lessons.java.immobiliare;

public class Immobile {
    protected String code;
    protected String address;
    protected String cap;
    protected String city;
    protected int surface;

    public Immobile(String code, String address, String cap, String city, int surface) {
        this.code = code;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.surface = surface;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
