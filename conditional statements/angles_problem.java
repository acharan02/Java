/**
whether the given triangle is a right-angled or isoscale
*/
import java.util.Scanner;
class angles_problem{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A value:");
        int A = in.nextInt();
        System.out.println("Enter B value:");
        int B = in.nextInt();
        System.out.println("Enter C value:");
        int C = in.nextInt();
        if(C*C==A*A+B*B){
            System.out.println("The triangle is Right-angle.");
        }

        if (A==B || B==C || A==C)
        {
            System.out.println("The triangle is Isoscales.");
        }
        else{
            System.out.println("The trianglen is unknown type");
        }
        in.close();
    }
}