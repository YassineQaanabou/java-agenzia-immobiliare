package org.lessons.java.immobiliare;

public class Villa extends Abitazione{
    private int surfaceGarden;

    public Villa(String code, String address, String cap, String city, int surface,int interested, int vani, int bathroom, int surfaceGarden) {
        super(code, address, cap, city, surface, interested, vani, bathroom);
        this.surfaceGarden = surfaceGarden;
    }
    public void reimpostaSuperfici(int surface, int surfaceGarden) {
        super.reimpostaSuperfici(surface);
        this.surfaceGarden=surfaceGarden;
    }

    @Override
    public String toString() {
        return "Villa "+ code + " indirizzo:"+address+" CAP:"+ cap +" città:"+city+" superfice:"+surface +" vani:"+vani +" bagni:"+ bathroom +" mq giardino:"+surfaceGarden;
    }
}
