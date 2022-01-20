//I certify that this assignment is entirely my own work.


package com.company;
import java.util.Scanner;

public class Main {

    //Variable for problem 3
    public static String binary_string = "";

    public static void main(String[] args) {

        //Crete a scanner object
        Scanner scan = new Scanner(System.in);

        //Problem 1
        int p1 = 10;
        print("Problem 1 result: ");
	    println(recursiveAddition(p1));

        //Problem 2
        int m = 10;
        int n = 9;
        System.out.print("Problem 2 result: ");
        System.out.println(gcd(m,n));

        //Problem 3
        print("Enter a number for problem 3: ");
        int p3_num = scan.nextInt(); //Get a number from the user

        //public static String binary_string; //Binary digits get appended to this string
        print(binary(p3_num));


    }

    //Define my print statement
    public static void print(String str) {
        System.out.print(str);
    }
    public static void print(int num) {
        System.out.print(num);
    }

    //Define my println statement
    public static void println(String str) {
        System.out.println(str);
    }
    public static void println(int num) {
        System.out.println(num);
    }

    //Problem 1
    public static int recursiveAddition(int n) {
        if (n == 0) {
            return 0; //base case
        } else {
            return n+recursiveAddition(n-1); //function
        }
    }

    //Problem 2
    public static int gcd(int m, int n) {
        if (m%n == 0) {
            return n; //base case
        } else {
            return gcd(n, m%n); //function
        }
    }

    //Problem 3
    public static String binary(int n) {
        binary_string = binary_string + String.valueOf(n%2);
        if (n/2 == 0) {

        } else {
            binary(n/2);
        }
        return binary_string;
    }


}





