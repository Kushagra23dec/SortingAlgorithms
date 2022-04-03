package com.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Insertion Sort
public class InsertionSort {
    public static void main(String[] args) {
        int i,j,k;
       // int [] a = new int[5];
        ArrayList<Integer> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = s.nextInt();
        System.out.println("Enter the Elements in Array: ");
        for(int x = 0;x<n;x++)
            a.add(x,s.nextInt());




        System.out.println("UnSorted Array: "+ a);

        for(j=1;j<a.size();j++){
            k = a.get(j); // assign value of key at jth position
            i = j-1; // value of i will always be one less than j
            while(i>=0 && a.get(i) > k){
                a.set(i+1,a.get(i)) ;
                i = i-1;
            }
            a.set(i+1,k);

        }

        System.out.println("Sorted Array: "+ a);

    }
}
