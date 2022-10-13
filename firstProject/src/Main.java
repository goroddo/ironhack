import java.util.Random;

public class Main {


    public static void main(String[] args) {

        String fullName = "Rodrigo Avendaño";
        System.out.printf("Welcome %s!\n", fullName);

        Random randNum = new Random();
        randNum.setSeed(223923);
        int reservedNum = randNum.nextInt(10) + 11;
        System.out.printf("Your reserved number is %s\n", reservedNum);

        System.out.printf("Goodbye %s\n", fullName
                .toUpperCase()
                .replaceAll(" ","_") );

    }
}


/*
Exercise 1 = Write a program that first write a welcome message using a "full name" attribute.
Then write a message announcing the reserved number. the reserved number is a random integer + 11.
Then it prints a goodbye message with the name in upper case and all the spaces converted to ' _' .
 */

