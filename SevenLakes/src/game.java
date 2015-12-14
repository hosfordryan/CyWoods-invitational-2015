
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
public class game {

    public static Scanner qwe;
    
    public static void one() throws Exception{
        String temp = qwe.nextLine();
        if (temp.equals("scythe")) {
            System.out.println("river");
        }
         if (temp.equals("tube")) {
            System.out.println("scythe");
        }
          if (temp.equals("river")) {
            System.out.println("tube");
        }
         
    }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("game.in"));
        int num = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
