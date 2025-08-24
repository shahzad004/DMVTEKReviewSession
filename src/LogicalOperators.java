public class LogicalOperators {

    public static void main(String[] args) {


        int age = 15;
        int income = 50000;

        if (age > 18 && income > 30000) {
            System.out.println("You are eligible for loan");
        } else {
            System.out.println("You are not eligible for loan");
        }

        int age1 = 16;
        boolean ParentalConsent = true;
        if (age1 >= 18 || ParentalConsent) {
            {
            }
            System.out.println("Allow to practice");
        } else{
            System.out.println("Not allow to practice");
        }

        boolean isRaining =true;

        if (!isRaining) {
            System.out.println("Let's go for a walk");
        } else{
            System.out.println("Take an umberlla with you");
        }
    }
}