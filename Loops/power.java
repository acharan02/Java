import java.util.Scanner;
public class power{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = in.nextInt();
        System.out.print("Enter the power= ");
        int power = in.nextInt();
        int Result = 1;
        for(int i=1;i<=power;i++){
            Result*=num;
        }
        System.out.print("The power for the give number is = "+Result);
    }
}