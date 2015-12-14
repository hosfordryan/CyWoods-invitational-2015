
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
public class phonebook {

    public static Scanner qwe;
    
    public static void one()throws Exception{
        ArrayList<String> fin = new ArrayList();
        int num = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            String temp = qwe.nextLine();
           // System.out.println(temp);
            String[] name = temp.split(" ");
            fin.add(name[1]+","+" "+name[0]);
        }
        Collections.sort(fin);
        for (int i = 0; i < fin.size(); i++) {
            System.out.println(fin.get(i));
        }
    }
    public static void main(String[] args)throws Exception {
        
// TODO code application logic here
        qwe = new Scanner(new File("phonebook.in"));
       
            one();
        
    }
    
}
