package com.apple;

public class NumberStatistic {
    private int count;
    private int max;
    private int min;
    private int sum;
    public NumberStatistic()
    {
        count = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        sum = 0;
    }
    public void pushNumber(int number){
        max = Integer.max(number,max);
        min = Integer.min(number,min);
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int getAverage() {
        if (count>0)
            return sum/count;
        return 0;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
