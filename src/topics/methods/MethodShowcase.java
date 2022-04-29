package topics.methods;

import java.util.Scanner;

/**
 * Return values
 * void methods
 * static
 * calling without params
 * Calling as a variable
 * calling inside of print stuff
 */

public class MethodShowcase {

    public static void main(String[] args){

        String output = ask();

        System.out.printf("%s", output);


    }

    private static String ask(){

        Scanner s = new Scanner(System.in);

        return s.nextLine();

    }

}
