
package Product;
import java.util.Scanner;

public class AssignmentAndOr {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char op;
        System.out.print("Do you love java = ");
        op = input.next().charAt(0);
        
        if( op == 'y' || op == 'Y'){
            System.out.print("You are a java lover");
        }
        else if( op == 'n' || op == 'N'){
            System.out.print("You are not a java lover");
        }
        else{
            System.out.print("You are gay");
        }
    }
 
}
