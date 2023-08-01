package org.lessons.java.immobiliare;

public class Abitazione extends Immobile{
    private int vani;
    private int bathroom;

    public Abitazione(String code, String address, String cap, String city, int surface, int vani, int bathroom) {
        super(code, address, cap, city, surface);
        this.vani = vani;
        this.bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "Abitazione "+ code + "indirizzo:"+address+" CAP:"+ cap +" città:"+city+" superfice:"+surface +" vani:"+vani +" bagni:"+ bathroom;
    }
}
