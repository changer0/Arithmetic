package org.learn.sort;

/**
 * Created by lulu on 2016/11/15.
 */
//整合常用的的搜索算法
public class Test {

    public static void main(String[] args) {
        int a[] = {0, 3, 5, 4, 6, 7, 6}; //a0不作为数据!!, 数据从1开始
        //insertSort(a);
        //selectSort(a);
        //bubbleSort(a);
        quickSort(a, 1, a.length-1);
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    //插入排序
    public static void insertSort(int[] a) {//a0为监视哨位置,不作为数据存储
        int len = a.length;
        for (int i = 2; i < len; i++) {
            if (a[i - 1] > a[i]) {
                a[0] = a[i];
                a[i] = a[i - 1];
                int j = 0;
                for (j = i - 2; a[j] > a[0]; j--) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = a[0];
            }

        }
    }

    //选择排序
    public static void selectSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = selectMinKey(a, i); //从i开始a.length中找到最小的位置
            if (i != j) {
                swap(a, i, j);
            }
        }
    }

    // 查找从i开始到a.length中最小的位置
    private static int selectMinKey(int[] a, int i) {
        int key = i;
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[key]) {
                key = j;
            }
        }
        return key;
    }

    //冒泡排序
    public static void bubbleSort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len - 1; i++) {
            for (int j = i; j < len - i; j++) {
                if (a[j + 1] < a[j]) {
                    swap(a, j + 1, j);
                }
            }
        }
    }

    //快速排序
    public static void quickSort(int[] a, int low, int high) {
        //递归快速排序
        int pivotLoc = 0;//中心点
        if (low < high) {
            pivotLoc = partitionLoc(a, low, high);
            quickSort(a, low, pivotLoc-1);
            quickSort(a, pivotLoc+1, high);
        }
    }

    //获取到a的下标 low ~ high 中, a[low]的应该放的位置, 即左边的数 < a[low] 右边的数 > a[low]
    private static int partitionLoc(int[] a, int low, int high) {
        a[0] = a[low];
        while (low < high) {
            while (low < high && a[high] >= a[0]) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= a[0]) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = a[0];
        return low;
    }


    //交换
    private static void swap(int[] a, int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }


}