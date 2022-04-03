package com.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

//Insertion Sort
public class InsertionSort {
    public static void main(String[] args) {
        int i,j,k;
        int [] a = new int[5];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = s.nextInt();
        System.out.println("Enter the Elements in Array: ");
        for(int x = 0;x<n;x++)
            a[x] = s.nextInt();




        System.out.println("UnSorted Array: "+ Arrays.toString(a));

        for(j=1;j<a.length;j++){
            k = a[j]; // assign value of key at jth position
            i = j-1; // value of i will always be one less than j
            while(i>=0 && a[i] > k){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = k;

        }

        System.out.println("Sorted Array: "+ Arrays.toString(a));

    }
}
