/*Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
import java.util.Scanner;    
public class billGenerator{     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of items: ");
        float pencil = sc.nextFloat();    
        float pen = sc.nextFloat();    
        float eraser = sc.nextFloat();     

        float totalcost = (pen + pencil + eraser);
        System.out.println("Total cost: " + totalcost);

        float gst = (totalcost+(totalcost*(18f/100f)));   
        System.out.println("Total cost with 18% gst: "+ gst);

        sc.close(); 
    } 
}  
