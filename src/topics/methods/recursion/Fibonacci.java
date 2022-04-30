package topics.methods.recursion;

//This could be a really cool question.

public class Fibonacci {

    private static long[] fibnumbers;

    public static void main(String[] args){

        int num = 100;

        fibnumbers = new long[num + 1];

        System.out.println(num(num));

    }

    private static long num(int num){

        if(num <= 1) {
            return num;
        }

        //Remove array stuff
        if(fibnumbers[num] != 0){
            return fibnumbers[num];
        }

        long nthFibNum =  num(num-1) + num(num-2);
        fibnumbers[num] = nthFibNum;

        return nthFibNum;

    }


}
