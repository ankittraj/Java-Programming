//Java Program to Reverse a String
import java.util.Scanner;
public class reverseeString{
    public static void main(String[] args) {
    String s ="Ankit";
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    System.out.println( "String is : "+sb);
    sb.reverse();
   System.out.println("Reversed string is : "+sb);
  }
}