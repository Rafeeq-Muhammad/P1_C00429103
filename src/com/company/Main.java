//I certify that this assignment is entirely my own work.


package com.company;

public class Main {

    public static void main(String[] args) {
        //Problem 1
        int p1 = 10;
        System.out.print("Problem 1 result: ");
	    System.out.println(recursiveAddition(p1));
    }

    //Problem 1
    public static int recursiveAddition(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n+recursiveAddition(n-1);
        }
    }



}





