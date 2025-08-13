import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
               System.out.print(j+" ");
               }
         System.out.println( );
        }
    }
}