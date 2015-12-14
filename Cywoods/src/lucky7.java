
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hosfo
 */
public class lucky7 {

       public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
     public static void solve(){
         int times = qwe.nextInt();
         qwe.nextLine();
         boolean win = false;
         for (int i = 0; i < times; i++) {
             
             String in = qwe.nextLine();
             //System.out.println("\t"+in);
             if (in.contains("7 7 7")) {
                // System.out.println("\t"+"should win");
                 win=true;
             }
             
             
         }
         if (win) {
             System.out.println("WINNER");
         }
         else{
             System.out.println("LOSER");
         }
     }
     
       
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("lucky7.dat"));
        int times = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
