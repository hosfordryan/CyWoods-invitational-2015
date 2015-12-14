
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
public class grader {

       public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
       
       public static void solve(){
           String wd = qwe.next();
           double a = qwe.nextDouble();
           if (a<=69.44) {
               System.out.print("F ");
           }
           else if(a<=79.44){
               System.out.print("C ");
           }
           else if(a<=89.49){
               System.out.print("B ");
           }
           else{
               System.out.print("A ");
           }
           System.out.print(wd+"\n");
       }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("grader.dat"));
        int times = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
