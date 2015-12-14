
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
public class real {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        String q1 = qwe.nextLine();
        String q2 = qwe.nextLine();
        String q3 = qwe.nextLine();
        String a1 = qwe.nextLine();
        String a2 = qwe.nextLine();
        String a3 = qwe.nextLine();
        String p1 = qwe.nextLine();
        String p2 = qwe.nextLine();
        String p3 = qwe.nextLine();
        
        System.out.println(q1+" : "+p1);
        System.out.println(q2+" : "+p2);
        System.out.println(q3+" : "+p3);
        if (a1.substring(0,a1.length()-1).equalsIgnoreCase(p1)) 
        if (a2.substring(0,a2.length()-1).equalsIgnoreCase(p2)) 
        if (a3.substring(0,a3.length()-1).equalsIgnoreCase(p3)) {
                    System.out.println("The Real McGee");
        return;
        }
        System.out.println("shoulda used Java");
    }
    
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("real.in"));
        int num =  qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
