package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("Enter array elements");
        for (int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sort(a);
        shuffle(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    static void shuffle(int[] a, int n)
    {
        int max_index = n;
        int min_index = 0;
        int max = a[n-1]+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                a[i] = ( a[min_index]%max ) * max + a[i];
                max_index--;
            }else{
                a[i] = ( a[max_index]%max ) * max + a[i];
                min_index++;
            }
        }

        for(int i=0;i<n;i++){
            a[i]/=max; // arr[i] = arr[i]/max;

        }
    }
    static void sort(int[]a) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    //swap elements
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }

            }
        }
    }

}
