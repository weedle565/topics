package topics.methods.recursion;

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

        if(fibnumbers[num] != 0){
            return fibnumbers[num];
        }

        long nthFibNum =  num(num-1) + num(num-2);
        fibnumbers[num] = nthFibNum;

        return nthFibNum;

    }


}
