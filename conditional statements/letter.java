//finding whether the first letter of the given string is upper or lower.
import java.util.Scanner;
public class letter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char ch = in.next().charAt(0);
        if(Character.isUpperCase(ch))
        {
            System.out.println(ch+" is an uppercase letter.");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println(ch+" is an lowercase letter.");
        }
        else
        {
            System.out.println(ch+" is not a letter.");
        }
        in.close();
    }
}
