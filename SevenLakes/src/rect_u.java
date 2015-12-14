
import java.io.File;
import java.util.Scanner;


public class rect_u {

    /**
     * @param args the command line arguments
     */
    public static Scanner qwe;
    
    public static void one()throws Exception{
        long x1 = qwe.nextLong();
        long y1 = qwe.nextLong();
        long x2 = qwe.nextLong();
        long y2 = qwe.nextLong();
        long sideOne =0;
        long sideTwo =0;
        if(x1 >= x2){
           sideOne = x1 -x2;  
        }
       if(x2> x1){
           sideOne = x2-x1;
       }
       if(y1>=y2){
          sideTwo = y1 -y2; 
       }
       if(y1<y2){
          sideTwo = y2 -y1; 
       }
        
        System.out.println(sideOne*sideTwo);
    }
    public static void main(String[] args)throws Exception {
       qwe = new Scanner(new File("rect_u.in"));
       int num = qwe.nextInt();
        for (int i = 0; i < num; i++) {
            one();
        }
    }
    
}
