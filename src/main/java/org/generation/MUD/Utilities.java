package org.generation.MUD;

public class Utilities {
    public static void stampaAMacchina(String text, int lengthMax) throws InterruptedException {
        StringBuilder sb= new StringBuilder();
        for (String word : text.split(" ") ){
            if (sb.length() >= lengthMax) {
                //System.out.println(sb);
                for (String ch : sb.toString().split("")) {
                    System.out.print(ch); //Ciao sono una(supera) Stringa
                    Thread.sleep(10);
                }
                System.out.println();
                sb.setLength(0); //Tenendo in considerazione che ha bisogno di un indice per inserire parola
                //se metto (0) è come se lo azzerassi; oppure New String Builder
            }
            sb.append(word);
            sb.append(" ");
        }
        for (String ch : sb.toString().split("")){
            System.out.print(ch); //Ciao sono una() Stringa non so cosa() dire ma mi() stop  //in generale non stampa l'ultima
            Thread.sleep(10);
        }
        System.out.println();
    }
}
