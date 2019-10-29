package com.apple;

public class HardPercents {
    public static int whileLoop(int inputSum, int proc, int wanted_sum) {
        int n = 0;
        double final_sum = inputSum;
        while(final_sum < wanted_sum) {
            final_sum += final_sum * proc / 100;
            n++;
        }
        return n;
    }

    public static int forLoop(int inputSum, int proc, int wanted_sum) {
        int n =0;
        double final_sum;
        for(final_sum = inputSum, n = 0; final_sum <= wanted_sum; final_sum += final_sum * proc / 100, n++){
            System.out.println(n + "\t" + final_sum);
        }
        return n;
    }

    public static int doWhileLoop(int inputSum, int proc, int wanted_sum) {
        int n = 0;
        double final_sum = inputSum;
        do {
            final_sum += (final_sum * proc / 100);
            n++;
        } while(final_sum <= wanted_sum);
        return n;
    }
}
