package com.company;


import java.io.Console;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input;

        Console console = System.console();
        System.out.println("Podaj wyraz do odwrócenia:");
        input = console.readLine();
        System.out.println(zwrocPalindrom(input));



    }


    public static String zwrocPalindrom(String input)
    {
        String output = new String();

        for (int i = input.length()-1; i >= 0; i--) {

            output+=input.charAt(i);

        }


        return output;



    }
}
