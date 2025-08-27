public class Main {
    public static void main(String[] args) {


        Cat myCat = new Cat();
        myCat.meow();
        //Cat.meow();
        myCat.name = "Shiba";
        myCat.age = 10;

        System.out.println(myCat.name+" "+myCat.age);

    }


}
