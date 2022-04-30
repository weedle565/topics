package topics.loops.loopFor;

import java.util.Scanner;

public class ForShowcase {

    private static boolean isPrime(int num){

        if(num <= 1){

            return false;

        }

        for(int i = 2; i < num; i++) {

            if (num % i == 0) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Num: ");

        if(isPrime(Integer.parseInt(s.nextLine()))){

            System.out.println("Number is prime!");

        } else {

            System.out.println("Number is not prime!");

        }

    }
}
