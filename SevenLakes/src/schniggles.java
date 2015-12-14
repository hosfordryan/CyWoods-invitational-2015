
import java.io.File;
import java.util.Scanner;


public class schniggles {

    public static Scanner qwe;
    
    public static void solve()throws Exception{
        System.out.println(qwe.nextInt() + qwe.nextInt());
    }
    
    public static void main(String[] args) throws Exception{
        qwe = new Scanner(new File("schniggles.in"));
        for (int i = 0; i < 3; i++) {
            solve();
        }
    }
    
}
