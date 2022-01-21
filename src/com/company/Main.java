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
        print("Problem 1 recursive addition result: ");
        println(recursiveAddition(p1));

        //Problem 2
        int m = 10;
        int n = 9;
        System.out.print("Problem 2 gcd result: ");
        System.out.println(gcd(m, n));

        //Problem 3
//        print("Enter a number for problem 3: ");
//        int p3_num = scan.nextInt(); //Get a number from the user
//        print("Binary representation of your number: ");
//        println(binary(p3_num));

        //Problem 4
        int harmonic_num = 2;
        print("The nth harmonic of ");
        print(harmonic_num);
        print(" is ");
        System.out.println(harmonic(harmonic_num));


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
            return 1/Double.valueOf(n) + harmonic(n-1);
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

