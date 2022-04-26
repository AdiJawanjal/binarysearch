package com.Binarysearchalgorithm;

import java.util.Arrays;

public class firstandlastposition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,4,5,5,6};
        int target = 5;
        int[] ans = check(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] check(int[] arr , int target ){
        int[] ans = {-1 , -1};
        int start = check1(arr , target , true);
        int end = check1(arr , target , false);
        ans[0] = start ;
        ans[1] = end ;
        return ans;
    }
    static int check1(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                if (target == arr[mid]) {
                    //potential ans is found
                    ans = mid;
                    if (findstartindex){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target == arr[mid]) {
                    //potential ans is found
                    if (findstartindex){
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
            }
        }
        return  ans;
    }
}
