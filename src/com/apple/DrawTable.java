package com.apple;

public class DrawTable {
    public static String draw(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                if(j>i)
                    sb1.append("\t");
                else
                    sb1.append((i-j) + "\t");
                if(i + j >= 4)
                    sb2.append((5-j) + "\t");
                else
                    sb2.append("\t");
            }
            sb1.append("\n");
            sb2.append("\n");
        }
        return sb1.append(sb2).toString();
    }
}
