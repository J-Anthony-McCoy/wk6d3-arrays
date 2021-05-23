package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ToPower {

//    Write a public static method called "toPower" that takes in as parameters two integers called size and power.
//    The method should return an array of size "size" with each array index raised to the value of "power."
//    So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should
//    return the following result: [0,1,4,9]

    public static void toPower(){
//        Scanner initialized. Asking user input for array length
        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your array to be?");
        int size = input.nextInt();
        input.nextLine();
//        Asking user input for power integer
        System.out.println("What integer do you want for power?");
        int power = input.nextInt();
        input.nextLine();
//        Creating array based on user specified size
        int [] userArray = new int[size];

        System.out.printf("Int is %d and power is %d.\n", size, power);
//        For loop to do math to array
        for(int i = 0; i < userArray.length; i++){
            userArray[i] = (int) Math.pow(i, power);
            System.out.println("Output: " + userArray[i]);
        }

    }
}
