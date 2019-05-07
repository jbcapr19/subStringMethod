package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word, any word: ");
        text = input.nextLine();

        System.out.println("The length of my word is " + text.length());

        System.out.println("Until which part of the sentence would you like to print?");
        int indexNum = input.nextInt();
        input.nextLine();

        // input validation loop
        boolean loopValidate = true;
        while (loopValidate){
            System.out.println("Index is beyond my limit! Enter a valid indexNum number");
            indexNum = input.nextInt();

            // exit condition
            if (indexNum < text.length()){
                loopValidate = false;
                System.out.println("good input");
                System.out.println("word from indexNum 0 to specified indexNum of " + indexNum + " is " + text.substring(0,indexNum));
            }

        }

        // test print statements
        System.out.println();
        System.out.println(text.substring(0));
        System.out.println(text.substring(0, indexNum));
        System.out.println(text.substring(indexNum));

    }

}
