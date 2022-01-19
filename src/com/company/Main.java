//I certify that this assignment is entirely my own work.


package com.company;

public class Main {

    //Problem 1
    static int p1_global_total = 0;

    public static void main(String[] args) {
	// write your code here
	System.out.println("Hello world!");
	System.out.println(recursiveAddition(10));
    }

    //Problem 1
    public static int recursiveAddition(int n) {
        //int local_total = 0;

        if (n == 1) {
            return 1;
        } else {
            p1_global_total = p1_global_total + n;
            n = n - 1;
            recursiveAddition(n);
        }
        return p1_global_total;
    }

}





