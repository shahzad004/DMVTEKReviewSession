public class MethodsPractice {

    public static void sayHello()
    {
        System.out.println("Hello World");
    }

    public static String showInformation(String name , int age)
    {
       return name + " is " + age + " years old";
    }

    public static void main(String[] args) {
        sayHello();
        showInformation("John Smith", 18);
        String result = showInformation("John Smith", 18);
        System.out.println(result);
    }



}




