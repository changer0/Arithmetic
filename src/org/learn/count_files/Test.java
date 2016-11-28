package org.learn.count_files;

import java.io.File;

/**
 * Created by lulu on 2016/11/21.
 * 统计文件的个数
 */
public class Test {
    public static void main(String[] args) {
        File testFiles = new File("testFiles");
        System.out.println(countFiles(testFiles));
    }


    public static int countFiles(File file) {
        int count = 0;
        if (file == null) {
            return 0;
        }
        if (file.isFile()) {
            return 1;
        }

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    count += countFiles(f);
                } else {
                    count++;
                }
            }
        }
        return count;
    }


}
