package com.Binarysearchalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Agnosticbinarysearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
        int target = in.nextInt();
        int ans1 = Binarysearch(ans , target);
        System.out.println(ans1);
    }

    static int[] check(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    static int Binarysearch(int[] ans, int target) {
        int start = 0;
        int end = ans.length - 1;
        if (ans[start] < ans[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < ans[mid]) {
                    end = mid - 1;
                }
                if (target > ans[mid]) {
                    start = mid + 1;
                }
                if (target == ans[mid]) {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > ans[mid]) {
                    end = mid - 1;
                }
                if (target < ans[mid]) {
                    start = mid + 1;
                }
                if (target == ans[mid]) {
                    return mid;
                }
            }
        }
        return  -1;
    }
}