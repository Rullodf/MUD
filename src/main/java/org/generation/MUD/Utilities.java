package org.generation.MUD;

public class Utilities {

    static int lengthMax = 100;
    /*
        Funzione che stampa a macchina la descrizione della stanza al momento dell'entrata
    */
    public static void stampaAMacchina(String text, int lengthMax){
        try{
            StringBuilder sb= new StringBuilder();
            for (String word : text.split(" ") ){
                if (sb.length() + word.length() >= lengthMax) {
                    //System.out.println(sb);
                    for (String ch : sb.toString().split("")) {
                        System.out.print(ch); //Ciao sono una(supera) Stringa
                        Thread.sleep(10);
                    }
                    System.out.println();
                    sb.setLength(0); //Tenendo in considerazione che ha bisogno di un indice per inserire parola
                    //se metto (0) è come se lo azzerassi; oppure New String Builder
                }
                if(word.contains("\n")){
                    sb.append(word.split("\n")[0]);
                    for (String ch : sb.toString().split("")) {
                        System.out.print(ch); //Ciao sono una(supera) Stringa
                        Thread.sleep(10);
                    }
                    System.out.println();
                    sb.setLength(0); //Tenendo in considerazione che ha bisogno di un indice per inserire parola
                    //se metto (0) è come se lo azzerassi; oppure New String Builder
                    word = word.split("\n")[1];
                }
                sb.append(word);
                sb.append(" ");
            }
            for (String ch : sb.toString().split("")){
                System.out.print(ch); //Ciao sono una() Stringa non so cosa() dire ma mi() stop  //in generale non stampa l'ultima
                Thread.sleep(10);
            }
            System.out.println();
        } catch (Exception _) {
        }

    }
    /*
        Funzione che stampa a macchina la descrizione della stanza al momento dell'entrata con limitazione massima per le
        parole per riga
    */
    public static void stampaAMacchina(String text){
        stampaAMacchina(text, lengthMax);
    }
    /*
        Funzione che setta il limite massimo di lunghezza della singola riga
    */
    public static void setLengthMax(int lengthMax){
        Utilities.lengthMax = lengthMax;
    }
}
