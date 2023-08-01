package org.lessons.java.immobiliare;

public class Villa extends Immobile{
    private int surfaceGarden;

    public Villa(String code, String address, String cap, String city, int surface, int surfaceGarden) {
        super(code, address, cap, city, surface);
        this.surfaceGarden = surfaceGarden;
    }

    @Override
    public String toString() {
        return "Villa "+ code + "indirizzo:"+address+" CAP:"+ cap +" città:"+city+" superfice:"+surface +" mq giardino:"+surfaceGarden;
    }
}
