//I certify that this assignment is entirely my own work.


package com.company;

public class Main {

    //Problem 1
    public static void main(String[] args) {
	System.out.println(recursiveAddition(4));
    }

    //Problem 1
    public static int recursiveAddition(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n+recursiveAddition(n-1);
        }
        //return n+recursiveAddition(n-1);
    }

}





