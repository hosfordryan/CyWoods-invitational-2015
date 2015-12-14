
import java.io.File;
import java.util.Scanner;


public class Wizard {

    
    public static Scanner qwe;
    
    
    public static void one(){
        String ln = qwe.nextLine();
        String[] a = ln.split("");
        for (int i = 0; i < a.length; i++) {
            
            if (a[i].equals("'"))System.out.print("q");
            if (a[i].equals("\""))System.out.print("Q");
            
            if (a[i].equals(","))System.out.print("w");
            if (a[i].equals("<"))System.out.print("W");
        
            if (a[i].equals("."))System.out.print("e");
            if (a[i].equals(">"))System.out.print("E");
            
            if (a[i].equals("p"))System.out.print("r");
            if (a[i].equals("P"))System.out.print("R");
            
            if (a[i].equals("y"))System.out.print("t");
            if (a[i].equals("Y"))System.out.print("T");
            
            if (a[i].equals("f"))System.out.print("y");
            if (a[i].equals("F"))System.out.print("Y");
            
            if (a[i].equals("g"))System.out.print("u");
            if (a[i].equals("G"))System.out.print("U");
            
            if (a[i].equals("c"))System.out.print("i");
            if (a[i].equals("C"))System.out.print("I");
            
            if (a[i].equals("r"))System.out.print("o");
            if (a[i].equals("R"))System.out.print("O");
            
            if (a[i].equals("l"))System.out.print("p");
            if (a[i].equals("L"))System.out.print("P");
            
            if (a[i].equals("a"))System.out.print("a");
            if (a[i].equals("A"))System.out.print("A");
            
            if (a[i].equals("o"))System.out.print("s");
            if (a[i].equals("O"))System.out.print("S");
            
            if (a[i].equals("e"))System.out.print("d");
            if (a[i].equals("E"))System.out.print("D");
            
            if (a[i].equals("u"))System.out.print("f");
            if (a[i].equals("U"))System.out.print("F");
            
            if (a[i].equals("i"))System.out.print("g");
            if (a[i].equals("I"))System.out.print("G");
            
            if (a[i].equals("d"))System.out.print("h");
            if (a[i].equals("D"))System.out.print("H");
            
            if (a[i].equals("h"))System.out.print("j");
            if (a[i].equals("H"))System.out.print("J");
            
            if (a[i].equals("t"))System.out.print("k");
            if (a[i].equals("T"))System.out.print("K");
            
            if (a[i].equals("n"))System.out.print("l");
            if (a[i].equals("N"))System.out.print("L");
            
            if (a[i].equals(";"))System.out.print("z");
            if (a[i].equals(":"))System.out.print("Z");
            
            if (a[i].equals("q"))System.out.print("x");
            if (a[i].equals("Q"))System.out.print("X");
            
            if (a[i].equals("j"))System.out.print("c");
            if (a[i].equals("J"))System.out.print("C");
            
            if (a[i].equals("k"))System.out.print("v");
            if (a[i].equals("K"))System.out.print("V");
            
            if (a[i].equals("x"))System.out.print("b");
            if (a[i].equals("X"))System.out.print("B");
            
            if (a[i].equals("b"))System.out.print("n");
            if (a[i].equals("B"))System.out.print("N");
            
            if (a[i].equals("m"))System.out.print("m");
            if (a[i].equals("M"))System.out.print("M");
            
            if (a[i].equals(" "))System.out.print(" ");
    
        }
           
    }
    
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        qwe = new Scanner(new File("wizard.dat"));
        
        while(qwe.hasNextLine()){
            one();
            System.out.println("");
        }
    }
    
}
