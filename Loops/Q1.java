/* Java program to print Even number between 0 and 100 */
public class Q1{
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)//by changing (int i=100;i>=1;i--) you can print numbers in decresing order
        {
            if(i%2==0)//by changing condition to (i%2!=0) you can print odd numbers...
                System.out.print(i+" ");
        }
    }
}