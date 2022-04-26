package com.Binarysearchalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      sorted array
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = in.nextInt();
        int ans = check(arr , target);
        System.out.println(ans);
    }
    static int check (int[] now , int target ){
        int start = 0;
        int end = now.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (target < now[mid]){
                end = mid - 1;
            }
            if (target > now[mid]){
                start = mid + 1;
            }
            if (target == now[mid]){
                return mid ;
            }
        }
        return -1 ;
    }
}
