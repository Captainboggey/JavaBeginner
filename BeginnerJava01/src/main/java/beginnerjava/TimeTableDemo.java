
package beginnerjava;

import java.util.Scanner;



public class TimeTableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, m , n;
        System.out.print("enter any number = ");
        m = input.nextInt();
        System.out.print("enter any number = ");
        n = input.nextInt();
        for ( i = m; i <= n; i++) {
            for ( j = 1; j <= 10; j++) {
            
            System.out.println(j+"X"+i  + "="+j*i);
            
        }
            System.out.println("\n\n");
        }
        

    }
    
}
