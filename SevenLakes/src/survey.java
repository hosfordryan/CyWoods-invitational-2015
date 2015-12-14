
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hosfo
 */
public class survey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner asd = new Scanner(new File("survey.in"));
        
        int nor =0;
        int male = 0;
        int tub = 0;
        ArrayList<Integer> ages = new ArrayList();
        while(asd.hasNextLine())
        {
            nor++;
            String[] line =asd.nextLine().split(" ");
            if (line[2].equalsIgnoreCase("male")) {
                male++;
            }
            ages.add(Integer.parseInt(line[3]));
            
            if (line[4].equalsIgnoreCase("yes")) {
                tub++;
                
            }
        }
                
            System.out.println("Number of Respondents : " + nor);
            System.out.print("Percentage of Male Tourists : "  );
            double per = ((male+.0)/nor)*100;
            System.out.printf("%.3f", per);
            System.out.println("");
            System.out.print("Percentage of Female Tourists : "  );
            System.out.printf("%.3f", 100-per);
            System.out.println("");
            System.out.print("Average Age of Tourists : "  );
            double sum=0;
            for (Integer a : ages) sum+=a;
            sum /=4;
            System.out.printf("%.3f", sum);
            System.out.println("");
            System.out.print("Percentage of who plan to go tubing : "  );
            double perc = ((tub+.0)/nor)*100;
            System.out.printf("%.3f", perc);
            System.out.println("");
            System.out.println("Have a great trip, everyone!");
            
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    }
    
}
