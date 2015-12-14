
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
public class safe {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        int count = 0;
        String bruh = qwe.nextLine();
        
        String[] lets = bruh.split("");
        
        if (bruh.length()<2) {
            System.out.println(bruh);
            return;
        }
        for (int i = 0; i < bruh.length(); i++) {
            if (!lets[i].equals("0")) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(bruh);
        }
        if (count<=1) {
            System.out.println("1");
        }
    }
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("safe.in"));
        int num =  qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
