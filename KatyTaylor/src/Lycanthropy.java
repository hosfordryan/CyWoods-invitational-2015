
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
public class Lycanthropy {

    public static Scanner qwe;
    
    
    public static void one(){
        double w = qwe.nextDouble();
        double m = qwe.nextDouble();
        
        //double top = w *3.14;
        //double bot = (m + 1234567890);
        //top = Math.pow(w *3.14, 0.333);
       // bot = Math.pow((m + 1234567890), 0.2);
        //Double ans = (Math.pow(w *3.14, 0.333)/Math.pow((m + 1234567890), 0.2))*1000;
        System.out.println(Math.round(((Math.pow(w *3.14, 0.333)/Math.pow((m + 1234567890), 0.2))*1000)+.0)/1000.0);
    }
    
    public static void main(String[] args) throws Exception{
        qwe = new Scanner(new File("lycanthropy.dat"));
        int num = qwe.nextInt();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
