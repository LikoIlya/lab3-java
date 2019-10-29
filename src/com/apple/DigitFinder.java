package com.apple;

public class DigitFinder {
    public static int count(int a, byte b) throws NumberFormatException{
        if(b>9) throw new NumberFormatException("Input correct digit [0-9]");
        int counter = 0;
        int mod;
        do {
            mod = a%10;
            if(mod==b) {
                counter++;
            }
            a /= 10;
        }while (a!=0);
        return counter;
    }
}
