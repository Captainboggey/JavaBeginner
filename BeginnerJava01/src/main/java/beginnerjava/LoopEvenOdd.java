
package beginnerjava;
import java.util.Scanner;

public class LoopEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, m , n;
        int sum =0;
        System.out.print("Enter Initial Number = ");
        m = input.nextInt();
        System.out.print("Enter Final Number = ");
        n = input.nextInt();
        
        for ( i = m; i <= n; i++) {
            
            if(i%2 !=0){
                sum = sum+i;
                System.out.println(i);
            }
            
        }
        System.out.println("Final Result = "+sum);
    }
}
