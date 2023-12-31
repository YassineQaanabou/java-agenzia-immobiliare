package org.lessons.java.immobiliare;

public class Box extends Immobile{
    private int carPlace;

    public Box(String code, String address, String cap, String city, int surface,int interested, int carPlace) {
        super(code, address, cap, city, surface, interested);
        this.carPlace = carPlace;
    }

    @Override
    public String toString() {
        return "Box "+ code + " indirizzo:"+address+" CAP:"+ cap +" città:"+city+" superfice:"+surface +" posti auto:"+carPlace+ " interessati:"+ interested;
    }
}
