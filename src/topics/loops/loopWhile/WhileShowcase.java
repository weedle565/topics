package topics.loops.loopWhile;

import java.util.Scanner;

public class WhileShowcase {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int finalNum = Integer.parseInt(s.nextLine());

        int counter = 0;

        while(counter <= finalNum){

            System.out.println(counter);

            counter++;

        }

        System.out.println("The counter has hit the number");


    }
}
