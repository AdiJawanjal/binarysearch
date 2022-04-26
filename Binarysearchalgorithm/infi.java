package com.Binarysearchalgorithm;

public class infi {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr , target , start , end);
    }
    static int binarysearch(int[] arr, int target , int start , int end) {
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
