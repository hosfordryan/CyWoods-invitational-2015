
import java.io.File;
import java.io.FileNotFoundException;
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
public class boorito {

    
    
    public static Scanner qwe;
    
    public static void one(){
        try{
        String temp = qwe.nextLine();
        String[] tempp = temp.split(":");
        String time = tempp[0].substring(tempp[0].length()-2)+":"+tempp[1];
        String a = tempp[0].substring(0,tempp[0].length()-2);
        

        
        if (a.equals("Self ")) {
            System.out.println("BURRITNO");
        }
        else{
            String[] t = time.split(":");
            int hour = Integer.parseInt(t[0]);
            int min = Integer.parseInt(t[1]);
            if (hour-12 >=5&&hour-12 <=10) {
                if (hour-12==10&&min>0) {
                    System.out.println("BURRITNO");
                }
                else{
                    System.out.println("BOORITO");
                }
                
            }
            else{
                System.out.println("BURRITNO");
            }
        }
        }catch(Exception e){}
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        qwe = new Scanner(new File("boorito.dat"));
        int num =  qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
