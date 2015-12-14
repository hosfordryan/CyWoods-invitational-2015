
import java.io.File;
import java.util.ArrayList;
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
public class factorfact {

      public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
      
      public static void solve(){
          ArrayList<Integer> factors = new ArrayList();
          
          int num = qwe.nextInt();
          for (int i = 1; i <= num; i++) {
              if (num%i==0) {
                  factors.add(i);
              }
          }
          for (int i : factors) {
              System.out.print(i+" : ");
              for (int j = 1; j <= i; j++) {
                  if (i%j==0) {
                      System.out.print(j+" ");
                  }
              }
          System.out.println("");
          }
          System.out.println("");
      }
      
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("factorfact.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
    
}
