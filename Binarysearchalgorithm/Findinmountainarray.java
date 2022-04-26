package com.Binarysearchalgorithm;

import java.util.Scanner;

public class Findinmountainarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,5,4,3,0};
        int target = in.nextInt();
        System.out.println(search(arr , target));
    }
    static int search (int[] arr , int target){
        int peak = Peak(arr);
        int firsttry = binarysearch(arr , target , 0 , peak);
        if (firsttry != -1){
            return firsttry;
        }
        return binarysearch(arr , target , peak+1 , arr.length-1);
    }
    static int Peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, henc3e cuz of above line that is the best possible ans
        // or return end as both are =
        return start ;
    }
    static int binarysearch(int[] arr, int target , int start , int end ) {
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
                    return mid;
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
                    return mid;
                }
            }
        }
        return  -1;
    }
}
