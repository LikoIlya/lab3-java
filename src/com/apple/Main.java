package com.apple;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Task 1");
        System.out.println("2 - Task 2");
        System.out.println("3 - Task 3");
        System.out.println("4 - Task 4");
        System.out.println("5 - Quit");
        try {
            selection = input.nextInt();
        } catch (InputMismatchException e) {
            selection = 6;
        }
        return selection;
    }


    public static void task1() {


        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Input your number where find to");
        int number = input.nextInt();
        System.out.println("Input your digit which find to");
        byte digit = input.nextByte();
        System.out.println("Count = " + DigitFinder.count(number, digit));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {


        Scanner input = new Scanner(System.in);

        /***************************************************/

        String str;
        NumberStatistic numStat = new NumberStatistic();
        System.out.println("Enter number, for finish type 'exit': ");
        while(input.hasNext() && !(str = input.next()).equals("exit")) {
            int number = Integer.parseInt(str);
            numStat.pushNumber(number);
        }
        System.out.println("Count = " + numStat.getCount() +
                "\nAverage = "+ numStat.getAverage()+
                "\nMax = "+ numStat.getMax()+
                "\nMin = "+ numStat.getMin());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task3() {


        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Input your sum to put in bank");
        int money = input.nextInt();
        System.out.println("Input your percent");
        int percent = input.nextInt();
        System.out.println("Input your wanted sum");
        int wanted = input.nextInt();
        System.out.println("Years = " + HardPercents.forLoop(money,percent,wanted));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void task4() {

        /***************************************************/

        System.out.println(DrawTable.draw());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int back_to_menu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return menu();
    }

    public static void main(String[] args) {
        int choise = menu();
        while (choise != 5){
            switch (choise){
                case 1:
                    task1();
                    choise = back_to_menu();
                    break;
                case 2:
                    task2();
                    choise = back_to_menu();
                    break;
                case 3:
                    task3();
                    choise = back_to_menu();
                    break;
                case 4:
                    task4();
                    choise = back_to_menu();
                    break;
                case 6:
                    choise = back_to_menu();
                default:
                    break;
            }
        }
    }
}
