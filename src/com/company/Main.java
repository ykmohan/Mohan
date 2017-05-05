package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
       System.out.println("the 1st number is " +a);
       System.out.println("the 2nd number is " +b);

        System.out.println("the numbers between 1st and 2nd number are");

        for (int i = a+1; i < b; i++) {
System.out.println(i);
        }



    }

    }




