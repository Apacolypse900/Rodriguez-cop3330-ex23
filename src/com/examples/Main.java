package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String Answer1 = myObj.next();

        if (Answer1.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String Answer2 = myObj.next();

            if (Answer2.equals("y"))
                System.out.println("Clean Terminal and try starting again");
            else
                System.out.println("Replace cables and try again");
        } else {
            System.out.println("Does the car make a slicking noise? ");
            String Answer3 = myObj.next();
            if (Answer3.equals("y"))
                System.out.println("Replace the battery");
            else {
                System.out.println("Des the car crank up but fail to start? ");
                String Answer4 = myObj.next();
                if (Answer4.equals("y"))
                    System.out.println("Check spark plug connections");
                else {
                    System.out.println("Does the engine start and then die?");
                    String Answer5 = myObj.next();
                    if (Answer5.equals("y")) {
                        System.out.println("Des your car have fuel injection? ");
                        String Answer6 = myObj.next();
                        if (Answer6.equals("y"))
                            System.out.println("Get it in for service");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    } else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}
