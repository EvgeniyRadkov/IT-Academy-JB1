package com.gmail.radzkovevgeni;

import com.gmail.radzkovevgeni.model.CreditCard;
import com.gmail.radzkovevgeni.model.TaskTwo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task One. Find characters that match the last character in a string:");

        String theGivenString = "String is very important class in Java";
        char[] theGivenStringArray = theGivenString.toCharArray();
        int sizeOfArray = theGivenStringArray.length - 1;
        System.out.print("The numbers of characters matching the last character - ");
        for (int i = 0; i < theGivenStringArray.length; i++) {
            if (theGivenStringArray[i] == theGivenStringArray[sizeOfArray]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Task Two. Search for strings that contain a set of characters 'cat' and 'dog':");

        TaskTwo string = new TaskTwo();
        string.printCondition();
        string.printComparativeStringWithTheCharactersCatAndDog();

        System.out.println();

        System.out.println("Task Three. Account transaction and current balance:");
        CreditCard creditCard = new CreditCard(5587, 20);
        CreditCard creditCardVisa = new CreditCard(8878, 50);
        CreditCard creditCardMasterCard = new CreditCard(8741, 30);
        creditCard.creditinMoneyToAnAccount(5587, 25);
        creditCardVisa.creditinMoneyToAnAccount(8878, 10);
        creditCardMasterCard.withDrawingMoneyToAnAccount(8741, 15);
        creditCard.printAccountInfotmation();
        creditCardVisa.printAccountInfotmation();
        creditCardMasterCard.printAccountInfotmation();

    }

}
