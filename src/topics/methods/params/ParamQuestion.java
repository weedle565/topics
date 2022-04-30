package topics.methods.params;

import java.util.Scanner;

/**
 *
 * Solution to a Q
 *
 */
public class ParamQuestion {

    public static double calX(double r, int theta){

        return r * Math.cos(theta);

    }

    public static double calY(double r, int theta){

        return r * Math.sin(theta);

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Input x and y: ");
        int angle = s.nextInt();
        double radius = s.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        double perim = 2 * radius * Math.PI;

        double x = calX(radius, angle);
        double y = calY(radius, angle);

        System.out.printf("Area: %.2f \nPerimeter: %.2f \nX: %.2f \nY: %.2f", area, perim, x, y);

    }

}
