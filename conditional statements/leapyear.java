//Write a Java program that takes a year from the user and prints whether it is a leap year or not.
import java.util.Scanner;
public class leapyear{
    public static void main(String[] args) 
    {
        Scanner kl = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = kl.nextInt();
        boolean x= (year%4==0);
        boolean y=(year%100!= 0);
        boolean z=((year%100==0) && (year%400==0));
        if(x &&(y||z))
        {
         System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}