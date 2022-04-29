package topics.data_types;

/**

int: A whole number %d
Boolean: A true/false statement (no printf)
double: A large decimal that holds up to 17 decimal places %f
String: A grouping of characters %s
Char: A specific ascii character that is stored as an int (its ascii value) but outputted as a character %s/%c
float: A smaller version of a double, up to 7 d.p. %f

Also talk about access modifiers public and private as well as variable names;
Printf, println, print
Discuss and show final keyword

*/

public class DataTypes {

    private static int integer = 1;
    private static String word = "hello";
    private static double  decimal = 2.3;
    private static float floatingDecimal = 0.04f;
    private static char i = 105;

    public static void main(String[] args){

        System.out.printf("%d, %s, %f, %.2f, %f, %.2f, %c", integer, word, decimal, decimal, floatingDecimal, floatingDecimal, i);

        integer++;
        word += " world";
        decimal *= 1023.2;
        floatingDecimal += 4f;
        i += 5; //outputs n;

        System.out.printf("\n%d, %s, %f, %.2f, %f, %.2f, %c", integer, word, decimal, decimal, floatingDecimal, floatingDecimal, i);

    }

}
