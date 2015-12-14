
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
public class whoWants {

   public static Scanner qwe;
   
   public static void one() throws Exception{
       
   }
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("whoWants.in"));
        while(qwe.hasNextLine()){
            if (qwe.nextLine().equals("Who wants to tube?")) {
                System.out.println("WE DO!");
            }
        }
        System.out.println("Silence is a friend that never betrays.");
    }
    
}
