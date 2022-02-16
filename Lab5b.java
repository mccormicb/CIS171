//Program: Lab5b
//Author: Braden McCormic
//Date Modified: 1/14/22
//Purpose: Calculate the average of 3 numbers

import java.util.Scanner;
public class Lab5b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer values:  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Average of your 3 numbers: " + average3(num1, num2, num3));

        input.close();
    }
    public static float average3(int a, int b, int c){
        float average = (a + b + c) / 3;
        return average;
    }
}
