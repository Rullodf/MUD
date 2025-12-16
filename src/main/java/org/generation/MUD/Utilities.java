package org.generation.MUD;

public class Utilities {

    static int lengthMax = 100;

    public static void stampaAMacchina(String text, int lengthMax){
        try{
            StringBuilder sb= new StringBuilder();
            for (String word : text.split(" ") ){
                if (sb.length() + word.length() >= lengthMax) {
                    stampaEReinizializza(sb);
                }
                while(word.contains("\n")){
                    String[] check = word.split("\n",1);
                    sb.append(check[0]);
                    stampaEReinizializza(sb);
                    //se metto (0) è come se lo azzerassi; oppure New String Builder

                    //word = check.length > 1 ? check[1] : "";

                    if(check.length > 1)
                        word = check[1];
                    else
                        word = "";
                }
                sb.append(word);
                sb.append(" ");
            }
            for (String ch : sb.toString().split("")){
                System.out.print(ch); //Ciao sono una() Stringa non so cosa() dire ma mi() stop  //in generale non stampa l'ultima
                Thread.sleep(10);
            }
            System.out.println();
        } catch (Exception e) {
            IO.println( "Errore: " + e.getMessage());
        }

    }

    private static void stampaEReinizializza(StringBuilder sb) throws InterruptedException {
        //System.out.println(sb);
        for (String ch : sb.toString().split("")) {
            System.out.print(ch); //Ciao sono una(supera) Stringa
            Thread.sleep(10);
        }
        System.out.println();
        sb.setLength(0); //Tenendo in considerazione che ha bisogno di un indice per inserire parola
        //se metto (0) è come se lo azzerassi; oppure New String Builder
    }

    public static void stampaAMacchina(String text){
        stampaAMacchina(text, lengthMax);
    }

    public static void setLengthMax(int lengthMax){
        Utilities.lengthMax = lengthMax;
    }
}
