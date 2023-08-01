package org.lessons.java.immobiliare;

public class Immobile {
    protected String code;
    protected String address;
    protected String cap;
    protected String city;
    protected int surface;

    protected int interested=0;

    public Immobile(String code, String address, String cap, String city, int surface, int interested) {
        this.code = code;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.surface = surface;
        this.interested = interested;
    }
    public int getInterested() {
        return interested;
    }

    public String getCode() {
        return code;
    }
    public void addInterested(){
        this.interested++;
    }
    public void reimpostaSuperfici(int surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
