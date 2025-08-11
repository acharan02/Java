//finding the power of the given number is even or odd(take the number, and the power as input)
import java.util.*;
public class prob1{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = in.nextInt(); 
        System.out.println("Enter the Power:");
        int p = in.nextInt();
        double result = Math.pow(num,p);
        if (result % 2==0)
        {
            System.out.println(" nth power of the given number is Even.");
        }
        else{
            System.out.println("nth power of the given number is Odd.");
        }
}
}