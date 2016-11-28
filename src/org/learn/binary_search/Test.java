package org.learn.binary_search;

import java.util.Arrays;

/**
 * Created by lulu on 2016/11/15.
 */

//二分搜索
public class Test {
    public static void main(String[] args) {
        int[] nums = {20, 34, 30, 45, 54, 60};
        // 先进行排序
        Arrays.sort(nums);
        System.out.println(binarySearch(nums, 54));

    }

    //已经排好序的数组
    public static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;//已经查到返回！
            } else if (nums[mid] > key) {
                end = mid - 1;
            } else if (nums[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

}