package org.lessons.java.immobiliare;

import java.util.ArrayList;

public class AgenziaImmobiliare {
    protected ArrayList<Immobile> listaImmobili = new ArrayList<>();

    public void addImmobile(Immobile immobile){
        listaImmobili.add(immobile);
    }

    public String cercaImmobile(String code){
        String response= null;
        for (Immobile immobile : listaImmobili) {
            if (immobile.getCode().equals(code)) {
                response="l'immobile è presente nella lista";
                break;
            } else {
                response="l'immobile non è presente nella lista";
            }
        }
        return response;
    }

    public String mostInteresting(){

        String codeInteresting=null;
        int interested=0;
        for (Immobile immobile : listaImmobili) {
            if(immobile.getInterested()>interested){
                codeInteresting=immobile.getCode();
        }
        }
        return ("l'immobile più interessante è il " +codeInteresting);
        }
}
