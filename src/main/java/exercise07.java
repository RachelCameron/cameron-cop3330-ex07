/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();
        int squareft = length * width;
        final double conversion = 0.092903;
        double squaremt = squareft * conversion;
        String output = "You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is\n" + squareft + " square feet\n" + squaremt + " square meters";
        System.out.println(output);
    }
}