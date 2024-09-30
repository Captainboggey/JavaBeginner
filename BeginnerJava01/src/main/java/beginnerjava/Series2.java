
package beginnerjava;

import java.util.Scanner;
public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i,n,result=1;
        System.out.print("Enter Number = ");
        n = input.nextInt();
        for ( i = 1.5; i <= n; i++) {
            System.out.print(i+"");
            result= result * .5;
            
        }
        System.out.println("");
        System.out.println("result "+result);
    }
    
}
