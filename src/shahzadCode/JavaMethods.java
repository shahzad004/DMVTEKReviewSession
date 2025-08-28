package shahzadCode;

public class JavaMethods {

    public static String school = "DMVTEK";

    public static String rev(String word){

        String revWord = "";
        for(int i = word.length()-1 ; i>=0; i--){
                     revWord +=word.charAt(i);
                 }
        return revWord;
    }
    
    public static double sum(int a, double b){
        double result = a + b;
        System.out.println(" Sum of A + B = " + result );
        return result;
    }

    public static void main(String[] args) {

        System.out.println( rev(school));



    }
}
