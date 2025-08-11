// given student is eligible to get a student loan, he/she must be in a age range 17 to 21 and must have a minimum of 80 marks in the test. take name, age, and marks as input.
import java.util.Scanner;
public class prob{
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Name: ");
    String name = in.nextLine();
    System.out.println("Enter the Age: ");
    int age = in.nextInt();
    System.out.println("Enter the Marks: ");
    double marks= in.nextDouble();
     if (age >=17 && age<=21 && marks >= 80)
     {
           System.out.println(name+" is Eligible for Loan");
     }
     else{
        System.out.println(name+" is not Eligible for Loan");
     }
     in.close();
    }
    
}