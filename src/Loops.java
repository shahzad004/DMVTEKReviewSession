public class Loops {

    public static void main(String[] args) {


        int count = 1;
        while (count <=10){
            System.out.println(count);
            count++;
        }

        int count1 =20;
        do{
            System.out.println(count1);
            count1++;
        } while (count1<=10);


        for (int i=0;i<=10;i++){
            System.out.println(i);
        }

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};


        for (int num: numbers){
            System.out.println(num);
        }

    }
}
