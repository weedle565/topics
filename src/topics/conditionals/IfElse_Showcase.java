package topics.conditionals;

import java.util.Scanner;

public class IfElse_Showcase {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Number: ");
        int num = Integer.parseInt(s.nextLine());

        if(isEven(num)){

            System.out.printf("The number %d is even", num);

        } else {

            System.out.printf("The number %d is odd", num);

        }
    }

    public static boolean isEven(int num){

        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }

    }
}
