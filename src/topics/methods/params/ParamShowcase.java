package topics.methods.params;

import java.util.Scanner;

/**
 * Talk about how different data types can be used as a parameter
 * Objects can also be used as params
 * Calling with params
 *
 * Theres a really good lab example that can be worked to show this well
*/

public class ParamShowcase {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();

        String combined = combineStrings(first, second);
        System.out.printf("%s", combined);
    }

    public static String combineStrings(String first, String second){

        second = first + " " + second;

        return second;

    }
}
