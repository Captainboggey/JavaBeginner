
package Product;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int id;
        String name;
        String des;
        int price;
         
        
        System.out.print("Enter id = ");
        id = input.nextInt();
        
        System.out.print("Enter title =  ");
        name = input.next();
       
        
        System.out.print("Enter price = ");
        price = input.nextInt();
        System.out.print("Enter des = ");
        des = input.next();
        
        
        
          
        
        System.out.println("Your Id = "+id);
         System.out.println("Your  Title =   "+name);
         System.out.println("Your price = "+price);
         System.out.println("Your description = "+des);
       
      
    }
    
}
