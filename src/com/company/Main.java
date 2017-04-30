package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        System.out.println("1st number is " + a);
        System.out.println("2nd number is " + b);
        System.out.println("the product of two numbers are " +a*b);
    }
}
