package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int j = 0;
        while (n > 0) {
            arr[j] = n % 2;
            n = n / 2;
            j++;
        }
        System.out.println("Binary Number :");
        for (int i = j-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
