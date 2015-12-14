
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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
public class three {
public static Scanner qwe;

    
    public static void solve(){
        String in = qwe.nextLine();
        String[] temp = in.split(" ");
        ArrayList<Integer> nums = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            nums.add(Integer.parseInt(temp[i]));
            //System.out.println(temp[i]);
        }
        Collections.sort(nums);
       // System.out.println(nums+"THING");
        int toUse = nums.get(nums.size()-1);
        if (toUse%2==0) {
            System.out.println(toUse/2);
        }
        else{
            System.out.println((toUse*3)+1);
        }
    }


    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("three.dat"));
        int num = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            solve();
        }
    }
}
