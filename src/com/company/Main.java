package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println("The random number is " + x);

        System.out.print(1 + r.nextInt(5) + " " );
        System.out.print(1 + r.nextInt(5) + " " );
        System.out.print(1 + r.nextInt(5) + " " );
        System.out.print(1 + r.nextInt(5) + " " );
        System.out.print(1 + r.nextInt(5) + " " );
        System.out.print(1 + r.nextInt(5) + " " );

        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }
    }
}
