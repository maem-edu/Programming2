package crit_thinking_5;

import java.util.Scanner;

public class UserArray {
    int SIZE = 5;
    int[] nums = new int[SIZE];

    public int[] getNums() {
        return nums;
    }

    public void setNums() {
        Scanner scnr = new Scanner(System.in);
        System.out.println ("Please enter " + SIZE + " integers:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter integer for index " + i + ": ");
            nums[i] = scnr.nextInt();
        }
        scnr.close();
    }  
}
