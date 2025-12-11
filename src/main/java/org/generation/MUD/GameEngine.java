package org.generation.MUD;

/*
    QUESTA E' LA VERA MAIN!!!
 */
import org.generation.MUD.item.Consumable;
import org.generation.MUD.item.effect.AddMP;
import org.generation.MUD.item.effect.RemoveVitality;

public class GameEngine {
    public void StartGame() {

    }
    public void stampaAMacchina(String text, int lengthMax) throws InterruptedException {
        StringBuilder sb= new StringBuilder();
        sb.length();
        for (String word : text.split(" ") ){
            if (sb.length()<lengthMax){
                sb.append(text);
            }else {
                //System.out.println(sb);
                for (String ch : sb.toString().split("")){
                    System.out.print(ch); //Ciao sono una(supera) Stringa
                    Thread.sleep(50);
                }
                System.out.println();
                sb.setLength(0); //Tenendo in considerazione che ha bisogno di un indice per inserire parola
                //se metto (0) è come se lo azzerassi;  oppure New String Builder
                sb.append(text);
            }
        }
        for (String ch : sb.toString().split("")){
            System.out.print(ch); //Ciao sono una() Stringa non so cosa() dire ma mi() stop  //in generale non stampa l'ultima
            Thread.sleep(50);
        }
    }
}
