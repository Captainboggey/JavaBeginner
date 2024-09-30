
package Product;

import java.util.Scanner;
public class EligibleCandidate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char master , english;
        System.out.print("Do you completed masters = ");
        master = input.next().charAt(0);
        System.out.print("Do you know english = ");
        english = input.next().charAt(0);
        
        if( master =='y' && english =='y'){
            System.out.print("You are eligable");
        }
        else{
            System.out.print("you are not eligable");
        }
        
        
    }
    
}
