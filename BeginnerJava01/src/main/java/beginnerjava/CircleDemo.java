
package beginnerjava;

import java.util.Scanner;
public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius , result;
        System.out.print("Enter Radius = ");
        radius = input.nextDouble();
        result = 3.1416 * radius * radius;
        System.out.println("Your result is = "+result);
    }
}
