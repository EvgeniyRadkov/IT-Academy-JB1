package com.gmail.radzkovevgeni;


public class Main {

    public static void main(String[] args) {
        ptintInfomationOne();

        int[] array1AndArray2 = getArray1AndArray2();

        System.out.println("\n");

        printInformationTwo();

        int valueSeason = 2;
        ptintTimeOfTheYear(valueSeason);

        System.out.println("\n");

        printInformarionThree();

        int minNaturalNumber = 20;
        int maxNaturalNumber = 50;
        printResult(minNaturalNumber, maxNaturalNumber);
    }

    private static void ptintInfomationOne() {
        System.out.println("1. In this code, the result of creation and combining two arrays into one:");
    }

    private static int[] getArray1AndArray2() {
        int[] array1 = {1, 2, 3, 4,};
        int[] array2 = {10, 11, 12, 13};
        int[] array3 = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            array3[count++] = array2[j];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        return array3;
    }

    private static void printInformationTwo() {

        System.out.println("2. Determination of the Season:");
    }

    private static void ptintTimeOfTheYear(int valueSeason) {
        switch (valueSeason) {
            case 1:
                System.out.println("Winter is now!");
                break;
            case 2:
                System.out.println("Spring is now!");
                break;
            case 3:
                System.out.println("Summer is now!");
                break;
            case 4:
                System.out.println("Autumn is now!");
                break;
            default:
                System.out.println("To determine the season, enter a value from 1 to 4!");
        }
    }

    private static void printInformarionThree() {
        System.out.println("3. The screen displays numbers that are divisible by 3 but not divisible by 5.");
    }

    private static void printResult(int minNaturalNumber, int maxNaturalNumber) {
        int num = minNaturalNumber;
        for (num = 20; num <= 50; num++) {
            if (num % 3 == 0 && num % 5 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}





