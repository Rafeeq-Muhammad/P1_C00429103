//I certify that this assignment is entirely my own work.


package com.company;

public class Main {

    public static void main(String[] args) {

        //Problem 1
        int p1 = 10;
        System.out.print("Problem 1 result: ");
	    System.out.println(recursiveAddition(p1));

        //Problem 2
        int m = 10;
        int n = 9;
        System.out.print("Problem 2 result: ");
        System.out.println(gcd(m,n));
    }

    //Problem 1
    public static int recursiveAddition(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n+recursiveAddition(n-1);
        }
    }

    //Problem 2
    public static int gcd(int m, int n) {
        if (m%n == 0) {
            return n;
        } else {
            return gcd(n, m%n);
        }
    }


}





