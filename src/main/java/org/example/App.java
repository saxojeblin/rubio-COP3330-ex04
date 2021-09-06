/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        String noun, verb, adjective, adverb;
        Scanner sc = new Scanner(System.in);
        char space = ' ';

        System.out.print("Enter a noun: ");
        noun = sc.nextLine();

        System.out.print("Enter a verb: ");
        verb = sc.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = sc.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = sc.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + space + noun + space + adverb + "? That's hilarious!");

    }
}
