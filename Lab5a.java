//Program: Lab5a
//Author: Braden McCormic
//Date Modified: 2/14/22
//Purpose: Receive user input to output integers and spaces.

import java.util.Scanner;
public class Lab5a{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which integer you would like to count to: ");
        int maxNum = input.nextInt();
        System.out.print("Enter how many spaces you would like between each number: ");
        int spaces = input.nextInt();

        for(int x = 1; x <= maxNum; x++){
            System.out.print(x);
            for(int y = 1; y <= spaces; y++){
                System.out.print(" ");
            } //end spaces for loop
        }//end count for loop
        System.out.println();
        input.close();
    }//end main
}//end class