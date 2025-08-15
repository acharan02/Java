//Write a program to print Fibonacci series of n terms where n is input by user.
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number= ");
        int num = in.nextInt();
        int first=0;
        int second=1;
        for(int i =3;i<=num;i++){
            int next = first + second;
            System.out.println(" "+next);
            first = second;
            second = next;
        }

    }
}