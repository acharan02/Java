/*
  * * * * *
    * * * *
      * * *
        * *
          *
    */
import java.util.Scanner;
public class Tpattern2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("Enter no of rows:");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}