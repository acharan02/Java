public class elseif{
    public static void main(String[] args){
        int score = 80;
        if (score >= 90){
            System.out.println("Excellent");
        }
        else if (score >= 80){
            System.out.println("Very Good");
        }
        else if (score >= 70){
            System.out.println("Good");
        }
        else {
            System.out.println("Need improvement");
        }
    }
}