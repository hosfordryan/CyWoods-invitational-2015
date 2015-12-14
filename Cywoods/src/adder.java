
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
public class adder {

      public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
      
      public static void solve(){
          int temp = qwe.nextInt();
          int[] nums = new int[temp];
          qwe.nextLine();
          String in = qwe.nextLine();
          String[] things = in.split(" ");
          int fav = Integer.parseInt(things[things.length-1]);
          for (int i = 0; i < things.length-1; i++) {
              nums[i] = Integer.parseInt(things[i]);
          }
          
          boolean there = false;
          
          ArrayList<Integer> numbers = new ArrayList();
          
          for (int i = 0; i < nums.length; i++) {
              numbers.add(nums[i]);
          }
         
          for (int j = 0; j < 1000000; j++) {
              Collections.shuffle(numbers);
          int count = 0;
          
          for (int i = 0; i < numbers.size(); i++) {
              if (count==fav) {
                  there = true;
                  break;
              }
              count+=numbers.get(i);
              //System.out.println("\t"+count);
          }
          }
          
          
          if (there) {
              System.out.println("Yes.");
              
          }
          else{
              System.out.println("Not Possible.");
          }
          
      }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("adder.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
