package com.example.week5test;

import java.util.ArrayList;
import java.util.List;

public class PigLatinConverter {


    public static void main(String args[]){
        String input, output = "";
        input = "Chicken Soup from Orlando Florida";

        //Get and store the separate words without the white space
        String[] words = input.split(" ");

        //Loop through each word in input string
        for(String word : words){
            //Loop through each character in word
            for(int i=0; i<word.length(); i++){
                //vowel search
                if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ||
                        word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U'){

                    //If vowel found, cut the strin in half using vowel as index point
                    String front = word.substring(0,i);
                    String newWord;

                    //if word starts with vowel, add appropriate suffix
                    if(!front.isEmpty()) {
                        newWord = word.substring(i) + front + "ay";
                    } else {
                        newWord = word.substring(i) + front + "way";
                    }
                    //append the output
                    output = output + " " + newWord;
                    break;
                }
            }
        }
        //print result
        System.out.println(output);


    }
}
