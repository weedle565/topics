package topics.conditionals;

import java.util.Scanner;

public class IfElse_Question {

    public static String grade(int mark){

        if(mark >= 0 && mark < 50){

            return "Fail";

        } else if(mark < 60){

            return "Pass";

        } else if(mark < 75){

            return "Credit";

        } else if(mark < 85){

            return "Distinction";

        } else if(mark <= 100){

            return "High distinction";

        } else {
            return "Invalid mark";
        }

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String grade = grade(Integer.parseInt(s.nextLine()));

        System.out.println("The student achieved a: " + grade);

    }

}
