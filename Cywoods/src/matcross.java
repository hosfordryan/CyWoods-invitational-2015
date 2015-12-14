
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
public class matcross {

      public static Scanner qwe;

    /**
     * @param args the command line arguments
     */
      
      
      public static void solve(){
          int x = qwe.nextInt();
          int y = qwe.nextInt();
          String[][] mat = new String[x][y];
          
          for (int i = 0; i < mat.length; i++) {
              for (int j = 0; j < mat[i].length; j++) {
                  mat[i][j]=" ";
              }
          }
          
          
          for (int i = 0; i < mat.length; i++) {
              
              if (i%2==1) {
                  for (int j = 0; j < mat[i].length; j++) {
                      if (j%2==1) {
                          mat[i][j]="#";
                      }
                  }
              }
              else{
                  for (int j = 0; j < mat[i].length; j++) {
                      if (j%2==0) {
                          mat[i][j]="#";
                      }
                  }
              }
          }
          
          for (int i = 0; i < mat[0].length; i++) {
              mat[0][i] = "#";
              mat[mat.length-1][i] = "#";
          }
          for (int i = 0; i < mat.length; i++) {
              mat[i][0] = "#";
              mat[i][mat.length-1] = "#";
          }
          
          for (int i = 0; i < mat.length; i++) {
              for (int j = 0; j < mat[i].length; j++) {
                  System.out.print(mat[i][j]);
              }
              System.out.println("");
          }
          
          System.out.println("");
      }
    public static void main(String[] args)throws Exception {
        qwe = new Scanner(new File("dryrun.dat"));
        int times = qwe.nextInt();
        for (int i = 0; i < times; i++) {
            solve();
        }
    }
    
}

      