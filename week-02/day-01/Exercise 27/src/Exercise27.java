public class Exercise27 {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Fizzbuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else {
                System.out.println(i);
            }


        }
    }
}
