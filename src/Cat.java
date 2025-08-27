public class Cat {
    public static int sum(int a, int b){
        return a+b;
    }

    String name;
    int age;

    public void meow(){
        System.out.println("Meow");

    }

    public static void main(String[] args) {
        sum(1,2);
        System.out.println(sum(1,2));
    }


}
