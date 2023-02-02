package com.ashishsir.workshop;

/**
 * @author Shashank
 */
public class CommonChar {
    String commonChar(String[] arr) {
        String str = arr[0];
        String commonStr = " ";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String str1 = str.substring(i, j);
                int k;
                for (k = 1; k < arr.length; k++) {
                    if (!arr[k].contains(str1)) {
                        break;
                    }
                }
                if (k == arr.length && commonStr.length() < str1.length()) {
                    commonStr = str1;
                }
            }
        }
        return commonStr;
    }

    public static void main(String[] args) {
        CommonChar com = new CommonChar();
        String[] str = {"bridgelabz", "brick", "bright"};
        String ans = com.commonChar(str);
        System.out.println(ans);
    }
}
