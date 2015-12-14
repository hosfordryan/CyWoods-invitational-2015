
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
public class hacking {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        int a = qwe.nextInt();
        qwe.nextLine();
        String[] add = new String[a];
        for (int i = 0; i < a; i++) {
            add[i]=qwe.nextLine();
           // System.out.println("\""+add[i]+"\"\t*******");
        }
        ArrayList<Integer> dex = new ArrayList();
        for (int i = 0; i < a; i++) {
            String temp = qwe.nextLine();
            //System.out.println("\""+temp+"\"\t----------");
            if (!add[i].equals(temp+"")) {
                dex.add(i);
            }
        }
        for (int i = 0; i < dex.size()-1; i++) {
            System.out.print(dex.get(i)+",");
        }
        System.out.println(dex.get(dex.size()-1));
    }
    
    
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("hacking.in"));
        
            one();
        
    }
    
}
