package com.ashishsir.workshop;

/**
 * @author Shashank
 */
public class CommonStr {
    String longestCommonString(String[] str) {
        if (str == null || str.length == 0) {
            return " ";
        }

        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || str[j].charAt(i) != ch) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }

    public static void main(String[] args) {
        CommonStr com = new CommonStr();
        String[] str = {"bridgelabz", "brick", "bright"};
        String ans = com.longestCommonString(str);
        System.out.println(ans);
    }
}
