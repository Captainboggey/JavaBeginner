
package beginnerjava;


public class MathClass {
    public static void main(String[] args) {
        int x=10 , y=-20;
        int result = Math.max(x, y);
        System.out.println("Maximum = "+result);
         result = Math.min(x, y);
        System.out.println("Minimum = "+result);
        
        int absolute= Math.abs(y);
        System.out.println("Absolute = "+absolute);
        
    }
}
