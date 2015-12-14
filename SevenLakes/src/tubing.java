
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
public class tubing {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        int tot = qwe.nextInt();
        int num = qwe.nextInt();
        qwe.nextLine();
        
        int[] nums = new int[num];
        String[] names = new String[num];
        
        for (int i = 0; i < num; i++) {
            String in = qwe.nextLine();
            String[] temp = in.split(", ");
            nums[i] = Integer.parseInt(temp[1]);
            names[i] = temp[0];
        }
        
        for (int i = 0; i < names.length; i++) {
            if (nums[i] <= tot) {
                System.out.println(names[i]);
            }
        }
        
    }
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        
        qwe = new Scanner(new File("tubing.in"));
        int num = qwe.nextInt();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
