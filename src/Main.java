import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rando = new Random();
        /*Random is the class in java that generates random numbers, it is part of 'java.util' package
        rando is an instance of the Random class
        new Ramdom(): this is a constructor call that creates a new instance of 'Random' class,
        which assigned to rando variable. the Random() constructor initializes the random number generator.*/

        int randomnum = rando.nextInt(100) + 1;
        /* nextInt(100): returns a random integer from 0 to 99.
        +1 : provide the result is a random integer between 1 and 100.*/

       // System.out.println("random num is:" + randomnum);

        int trycount=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the number between 1 to 100: ");

            int usernum = scanner.nextInt();
            trycount++;

            if (usernum == randomnum) {
                System.out.println("CORRECT! YOU WIN!!");
                System.out.println("IT TOOK YOU:"+trycount+" TRIES");
                break;
            } else if (randomnum < usernum) {
                System.out.println("SORRY!! The number is HIGHER...GUESS AGAIN.");
            } else {
                System.out.println("SORRY!! The number is LOWER...GUESS AGAIN.");
            }
        }
        scanner.close();
    }

}