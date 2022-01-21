// Rafeeq Muhammad
// C00429103
// CMPS 261
//
// Program Description: This program is a problem set that involves a series of recursive functions.
//
// Certificate of Authenticity:
//I certify that the code in the method functions including method function main of this project are entirely my own work.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Crete a scanner object
        Scanner scan = new Scanner(System.in);

        //Problem 1
        int p1 = 10;
        print("Problem 1, recursive addition result: ");
        println(recursiveAddition(p1));

        //Problem 2
        int m = 10;
        int n = 9;
        System.out.print("Problem 2, gcd result: ");
        System.out.println(gcd(m, n));

        //Problem 3
        print("Problem 3, please inter a number: ");
        int p3_num = scan.nextInt(); //Get a number from the user
        print("Problem 3, the binary representation of your number is ");
        println(binary(p3_num));

        //Problem 4
        for (int i = 1; i <= 10; i++) {
            print("Problem 4 The ");
            print(i);
            print("th harmonic number is ");
            System.out.println(series(i));
        }

        //Problem 5
        for (int i = 1; i <= 10; i++) {
            print("Problem 5, m(");
            print(i);
            print(") = ");
            System.out.println(series(i));
        }

        //Problem 6
        int[] p6_array = new int[8];
        print("Problem 6, please enter 8 integers separated by spaces: ");
        for (int i = 0; i < p6_array.length; i++) {
            p6_array[i] = scan.nextInt();
        }
        print("Problem 6 The largest number in your array was: ");
        println(largest_int(0, p6_array[0], p6_array));

        //Problem 7
        int p7_num = 6;
        print("Problem 7, ");
        print(p7_num);
        print("!! is ");
        System.out.print(oddevenfact(p7_num));
    }

    /* Name:        print
     *
     * Description: Prints a string to the console.
     *
     * Pre:         The function accepts a string as an input.
     *
     * Post:        The function prints the string to the console.
     */
    public static void print(String str) {
        System.out.print(str);
    }

    /* Name:        print
     *
     * Description: Prints an integer to the console.
     *
     * Pre:         The function accepts an integer as a parameter.
     *
     * Post:        The function prints the integer to the console.
     */
    public static void print(int num) {
        System.out.print(num);
    }

    /* Name:        println
     *
     * Description: The function prints a string to the console followed by a newline.
     *
     * Pre:         The function accepts a string as an input.
     *
     * Post:        The function prints the string to the console, followed by a newline.
     */
    public static void println(String str) {
        System.out.println(str);
    }

    /* Name:        println
     *
     * Description: The function prints an integer to the console followed by a newline.
     *
     * Pre:         The function accepts an integer as an input.
     *
     * Post:        The function prints the integer to the console, followed by a newline.
     */
    public static void println(int num) {
        System.out.println(num);
    }

    /* Name:        recursiveAddition
     *
     * Description: Compute the sum of all integers between 0 and some integer n.
     *
     * Pre:         One integer is passed to the function.
     *
     * Post:        This function returns an integer that represents the sum of all
     *              integers between 0 and n.
     */
    public static int recursiveAddition(int n) {
        if (n == 0) {
            return 0; //base case
        } else {
            return n + recursiveAddition(n - 1); //function
        }
    }

    /* Name:        gcd
     *
     * Description: Find the greatest common denominator of 2 numbers, m and n.
     *
     * Pre:         2 integers, m and n are passed into the function. n is less than m.
     *
     * Post:        The function returns an integer that is the greatest common divisor
     *              of the 2 numbers m and n.
     */
    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n; //base case
        } else {
            return gcd(n, m % n); //function
        }
    }

    /* Name:        binary
     *
     * Description: Converts an integer to the string representation of its binary equivalent.
     *              Finds the highest-order binary number in the string, then recursively finds
     *              the other binary digits.
     *
     * Pre:         A non-negative integer, n, in passed into the function.
     *
     * Post:        The function returns the string representation of the binary equivalent of
     *              inputted integer.
     */
    public static String binary(int n) {
        if (n / 2 == 0) {
            return String.valueOf(n % 2);
        } else {
            return String.valueOf(n % 2) + String.valueOf(binary(n % 2));
        }
    }


    /* Name:        harmonic
     *
     * Description: This double-valued function calculates and returns the nth harmonic number, where
     *              n is an integer that the function receives as a parameter.
     *
     * Pre:         An integer n is defined and passed to the function.
     *
     * Post:        An double value, the nth harmonic, is returned.
     */

    public static double harmonic(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1 / Double.valueOf(n) + harmonic(n - 1);
        }
    }

    /* Name:        series
     *
     * Description: This function computes the series i/(2i + 1), where i is an integer received by the function.
     *
     * Pre:         The function receives an integer as a parameter.
     *
     * Post:        The function computes the series 1(2i+1) based on the parameter it received.
     */

    public static double series(int i) {
        if (i == 1) {
            return 1.0 / 3.0;
        } else {
            return Double.valueOf(i) / Double.valueOf(2 * i + 1) + series(i - 1);
        }
    }

    /* Name:        largest_int
     *
     * Description: This function receives an array of integers, and returns the
     *              highest integer found in that array.
     *
     * Pre:         The user is prompted to input 8 integers. The 0h index, and value of the array at the 0th index,
     *              and the array containing the integers is passed to the function.
     *
     * Post:        .
     */
    public static int largest_int(int index, int largest_num, int[] array) {
        if (index > array.length - 1) {
            return largest_num;
        } else {
            if (array[index] > largest_num) {
                largest_num = array[index];
            }
            index = index + 1;
            return largest_int(index, largest_num, array);
        }
    }

    /* Name:        oddevenfact
     *
     * Description: This function calculates n!!, where n is a single integer argument inputted
     *              into the function.
     *
     * Pre:         An integer n is passed into the function.
     *
     * Post:        The n!! is calculated in the function. The result, a long, is returned.
     */
    public static long oddevenfact(int n) {
        if (n % 2 == 0) { //n is even
            if (n == 2) { //base case
                return 2;
            } else {
                return n * oddevenfact(n - 2); //general case
            }
        } else { //n is odd
            if (n == 1) { //base case
                return 1;
            } else { //general case
                return n * oddevenfact(n - 2);
            }
        }
    }
}

/* Name:        .
 *
 * Description: .
 *
 * Pre:         .
 *
 * Post:        .
 */
