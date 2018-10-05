package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.print("say what you want to say");
        userInput = sc.next();

        while(userInput != " "){
            System.out.println( "you can still write");
            userInput = sc.next();
            sc.nextLine();
            System.out.print("you can stop or enter to rewrite");


        }
    }
}
