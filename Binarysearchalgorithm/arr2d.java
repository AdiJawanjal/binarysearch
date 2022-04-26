package com.Binarysearchalgorithm;

import java.util.Arrays;

public class arr2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 8, 12},
                {2, 5, 9, 14},
                {3, 6, 10, 16},
                {4, 7, 11, 18}
        };
        int target = 10;
        System.out.println(Arrays.toString(check(arr , target)));
    }
    static int[] check(int[][] arr , int target){
        int r = 0;
        int c = arr.length - 1 ;
        while (r < arr.length -1 && c >= 0){
            if(target == arr[r][c]){
                return new int[]{r,c};
            }
            if(target < arr[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}