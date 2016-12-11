package org.learn.niuke.replace_space;

/**
 * Created by lulu on 2016/12/10.
 */

public class Solution {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world");
        System.out.println(replaceSpace(stringBuffer));
    }
//    public static String replaceSpace(StringBuffer str) {
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == ' ') {
//                str.delete(i, i+1);
//                str.insert(i, "%20");
//            }
//        }
//        return str.toString();
//    }
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}
