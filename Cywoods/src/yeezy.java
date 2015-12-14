
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
public class yeezy {

       public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
       
       
       public static void solve(){
           
           Double a = qwe.nextDouble();
           Double h = 1.0;
           
           
           h*=43.0;
           h*=4;
           
           h*=5;
           h-=1;
           a*=0.25;
           a*=h;
           if (a>=2000) {
               System.out.println("True");
           }else{
               System.out.println("False");
           }
           
           
              
           
       }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("yeezy.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            solve();
            
        }
    }
    
    
}
