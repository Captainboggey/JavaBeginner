
package beginnerjava;


public class ContinueDemo {
    
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++){
            if(i==100){
                continue;
            }
            if(i==50){
                continue;
            }
            System.out.println(i);
               
        }
    }
}
