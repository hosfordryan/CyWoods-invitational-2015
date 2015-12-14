
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
public class visas {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        int numf = qwe.nextInt();
        int numm = qwe.nextInt();
        ArrayList<String> names = new ArrayList();
        ArrayList<String> mf = new ArrayList();
        qwe.nextLine();
        while(qwe.hasNextLine()){
            String line = qwe.nextLine();
            //System.out.println(line);
            String[] temp = line.split(", ");
            names.add(temp[0]);
            mf.add(temp[1]);
        }
        
        for (int i = 0; i < names.size(); i++) {
            if (mf.get(i).equals("female")&&numf>0) {
                numf--;
                System.out.println(names.get(i));
            }
            
        }
        for (int i = 0; i < names.size(); i++) {
            
         if (mf.get(i).equals("male")&&numm>0) {
                numm--;
                System.out.println(names.get(i));
            }
        }
    }
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("visas.in"));
        one();
    }
    
}
