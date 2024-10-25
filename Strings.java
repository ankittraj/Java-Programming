import java.util.*;

public class Strings{
    public static void main(String args[]){

        //String Declaration
        String firstName = "Ankit";
        String lastName = " Raj";
        String fullName = firstName + lastName;

        System.out.println(fullName);

        //Input String

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your university name: ");
        String university = sc.nextLine();

        System.out.println(fullName);
        System.out.println("Your university is "+ university);

        sc.close();
    }
}