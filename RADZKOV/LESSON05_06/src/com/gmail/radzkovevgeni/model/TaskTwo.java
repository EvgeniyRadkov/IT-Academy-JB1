package com.gmail.radzkovevgeni.model;

import org.w3c.dom.ls.LSOutput;

public class TaskTwo {

    private String stringOne = "cat";
    private String stringTwo = "horse";
    private String stringThree = "dog is best friend";
    private String stringFour = "mouse";
    private String stringFive = "frog";
    int lengthString = 0;
    private static int numberOfString = 5;

    public void printCondition() {
        System.out.println("There are strings: " + stringOne + ", " + stringTwo + ", " +
                stringThree + ", " + stringFour + ", " + stringFive);
        System.out.println("The string with the characters cat and dog:");
    }


    public void printComparativeStringWithTheCharactersCatAndDog() {
        if (stringOne.contains("cat") || stringOne.contains("dog")) {
            System.out.println(stringOne);
            lengthString += stringOne.length();
        } else {
            numberOfString--;
        }
        if (stringTwo.contains("cat") || stringTwo.contains("dog")) {
            System.out.println(stringTwo);
            lengthString += stringTwo.length();
        } else {
            numberOfString--;
        }
        if (stringThree.contains("cat") || stringThree.contains("dog")) {
            System.out.println(stringThree);
            lengthString += stringThree.length();
        } else {
            numberOfString--;
        }
        if (stringFour.contains("cat") || stringFour.contains("dog")) {
            System.out.println(stringFour);
            lengthString += stringFour.length();
        } else {
            numberOfString--;
        }
        if (stringFive.contains("cat") || stringFive.contains("dog")) {
            System.out.println(stringFive);
            lengthString += stringFive.length();
        } else {
            numberOfString--;
        }
        System.out.println("The string with the characters cat and dog is long - " + lengthString);
        System.out.println("Number of lines not matching in comparison - " + numberOfString);
    }

}
