
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
public class sample {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        Double y = qwe.nextDouble();
        Double h = qwe.nextDouble();
        Double t = qwe.nextDouble();
        Double u = qwe.nextDouble();
        
        Double yhANS = y*h;
        Double t1ANS = 1/t;
        Double numerator = Math.pow(yhANS, t1ANS);
        Double fracANS = numerator/2;
        Double ans = fracANS*u;
        System.out.printf("%.2f",ans);
        System.out.println("");
    }
    
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("sample.in"));
        int num = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
