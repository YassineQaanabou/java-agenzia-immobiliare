package org.lessons.java.immobiliare;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Immobile b1 = new Box("ABC123XY", "via marco polo 5","8695", "Milano", 25, 1 , 1);
        Immobile b2 = new Box("SDFCG78D", "via giulio polo 56","2784", "Roma", 25, 2,2 );
        Immobile b3 = new Box("DFBHDF6D", "via maldini 4","2594", "Perugia", 25, 5 ,1);

        Immobile a1 = new Abitazione("SEHER789", "via potenza 5","8695", "Milano", 67, 4 , 1,1);
        Immobile a2 = new Abitazione("78SDFGS8", "via lorenzo  56","2784", "Roma", 45, 6,2,1 );
        Immobile a3 = new Abitazione("SDFG789D", "via fragile 4","2594", "Perugia", 75, 10 ,1,1);


        Immobile v1 = new Villa("ASDFPO43", "via stretta 5","8695", "Milano", 37, 7 , 1,2,23);
        Immobile v2 = new Villa("34GSHR65", "via curva  56","2784", "Roma", 49, 5,2,3,34 );
        Immobile v3 = new Villa("POASD634", "via retta 4","2594", "Perugia", 25, 20 ,1,1,45);

        AgenziaImmobiliare agenzia=new AgenziaImmobiliare();

        agenzia.addImmobile(b1);
        agenzia.addImmobile(b2);
        agenzia.addImmobile(b3);
        agenzia.addImmobile(a1);
        agenzia.addImmobile(a2);
        agenzia.addImmobile(a3);
        agenzia.addImmobile(v1);
        agenzia.addImmobile(v2);
        agenzia.addImmobile(v3);

        for (Immobile immobile : agenzia.listaImmobili){
            System.out.println(immobile);
        }

        System.out.println("inserire il codice alfanumerico dell'abitazione da cercare");
        String codeToSearch=scan.nextLine();

        System.out.println("ti intererssa questo immobile? y/n");
        String choice= scan.nextLine();;

        if (choice.equalsIgnoreCase("y")){
            for (Immobile immobile :agenzia.listaImmobili){
                if (codeToSearch.equalsIgnoreCase(immobile.getCode())){
                    immobile.addInterested();
                }
            }
        } else {
            System.out.println("torni a trovarci");

        }


        System.out.println(agenzia.cercaImmobile(codeToSearch));
        System.out.println(agenzia.mostInteresting());

        scan.close();
    }
}
