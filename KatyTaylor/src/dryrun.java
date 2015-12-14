
import java.io.File;
import java.util.Scanner;


public class dryrun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner qwe = new Scanner(new File("dryrun.dat"));
        
        int num = qwe.nextInt();
        qwe.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("I like "+qwe.nextLine()+".");
        }
    }
    
}
