//Write a program to print out all Armstrong numbers between 1 and 500.
public class amstrong{
    public static void main(String[] args) {
        for (int number=1;number<=500;number++){
            int temp=number;

            int digit1 = temp % 10;
            temp /= 10;
            
            int digit2 = temp % 10;
            temp /= 10;
            
            int digit3 = temp % 10;
            if((digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3)==number){
                System.out.println(number);
            }

        }
    }
}