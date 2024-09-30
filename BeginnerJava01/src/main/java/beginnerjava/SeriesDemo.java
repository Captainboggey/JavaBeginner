
package beginnerjava;


import java.util.Scanner;

public class SeriesDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,sum=0,i;
        
        System.out.print("Enter your number = ");
        n = input.nextInt();
        
        for ( i = 1; i <= n; i=i+1) {
            System.out.print(i+ " x "+i);
            sum = sum+ i*i;
            
        }
        System.out.println("");
               
        System.out.println("your result= "+sum);
        
    }
    
}
