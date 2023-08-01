package org.lessons.java.immobiliare;

import java.util.ArrayList;

public class AgenziaImmobiliare {
    protected ArrayList<Immobile> listaImmobili = new ArrayList<>();

    public void addImmobile(Immobile immobile){
        listaImmobili.add(immobile);
    }

    public Immobile cercaImmobile(String code){
        Immobile immobileToFind = null;

        for (Immobile immobile : listaImmobili) {
            if (immobile.getCode().equals(code)) {
                immobileToFind=immobile;
                break;
            }
        }
        return immobileToFind;
    }

    public Immobile mostInteresting(){

        Immobile immobileInteresting=null;
        int interested=0;
        for (Immobile immobile : listaImmobili) {
            if(immobile.getInterested()>interested){
                immobileInteresting=immobile;
        }
        }
        return immobileInteresting;
        }
}
