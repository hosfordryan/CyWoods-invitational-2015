
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
 * 
 * 
 */

   
public class DryRub {
    
    public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("dryrun.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            int num1 = qwe.nextInt();
            int num2 = qwe.nextInt();
            System.out.println(num1+num2);
            
        }
    }
    
}
