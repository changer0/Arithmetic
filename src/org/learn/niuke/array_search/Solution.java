package org.learn.niuke.array_search;

/**
 * Created by lulu on 2016/12/10.
 */
public class Solution {
    public static void main(String[] args) {

    }
    public boolean Find(int target, int [][] array) {
        int len = array.length - 1;//行
        int i = 0;
        while (len >= 0 && i < array[0].length) {//保证在数组范围内
            if (array[len][i] > target) {
                len--;
            } else if (array[len][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}