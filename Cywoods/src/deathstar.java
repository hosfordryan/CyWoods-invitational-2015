
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
public class deathstar {

       public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
       
       
       public static void solve(){
           if (qwe.nextLine().equals("Empire")) {
               System.out.println("False");
           }
           else{
               System.out.println("True");
           }
       }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("deathstar.dat"));
        int times = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
