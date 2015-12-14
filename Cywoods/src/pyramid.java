
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
public class pyramid {

       public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
       
       public static void solve(){
           int num = qwe.nextInt();
           if (num==0) {
               System.out.println("NOT BUILDABLE");
               System.out.println("");
               return;
           }
           for (int i = num; i > 0; i--) {
               for (int j = 0; j < i; j++) {
                   System.out.print(i);
               }
               System.out.println("");
           }
           System.out.println("");
       }
       
       
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("pyramid.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
