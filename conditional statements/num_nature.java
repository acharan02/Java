
import java.util.Scanner;

 public class num_nature{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Number: " );
        int x = input.nextInt();
        if (x>0){
            System.out.println(x + " is a Postive number.");
        }
        else if (x<0){
            System.out.println(x + " is a Negative number.");
        }
        else{
            System.out.println("The number is Zero.");
        }
        input.close();
        
    }
 }