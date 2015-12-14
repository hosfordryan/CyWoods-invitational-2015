
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
public class Afraid {

    public static Scanner qwe;
    public static void main(String[] args) throws Exception {
        qwe = new Scanner(new File("afraid.dat"));
        
        int num = qwe.nextInt();
        for (int i = 0; i < num; i++) {
            int num1 = qwe.nextInt();
            int num2 = qwe.nextInt();
            System.out.println(num1+"spooky"+num2+"me");
        }
    }
    
}
