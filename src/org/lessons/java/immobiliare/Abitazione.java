package org.lessons.java.immobiliare;

public class Abitazione extends Immobile{
    protected int vani;
    protected int bathroom;

    public Abitazione(String code, String address, String cap, String city, int surface,int interested ,int vani, int bathroom) {
        super(code, address, cap, city, surface, interested);
        this.vani = vani;
        this.bathroom = bathroom;
    }

    @Override
    public void reimpostaSuperfici(int surface) {
        super.reimpostaSuperfici(surface);
    }

    @Override
    public String toString() {
        return "Abitazione "+ code + " indirizzo:"+address+" CAP:"+ cap +" città:"+city+" superfice:"+surface +" vani:"+vani +" bagni:"+ bathroom+ " interessati:"+ interested;
    }
}
