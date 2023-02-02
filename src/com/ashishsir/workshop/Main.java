package com.ashishsir.workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shashank
 */
public class Main {
    void array(String[] arr) {
        // creating list to store the value
        List<String> ans = new ArrayList<>();
        // creating array of number of characters 26
        int[] dict = new int[26];
        for (int i = 0; i < arr[0].length(); i++) {
            dict[arr[0].charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            int[] curr = new int[26];
            for (int j = 0; j < arr[i].length(); j++) {
                curr[arr[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                if (curr[j] < dict[i]) dict[j] = curr[j];
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < dict[i]; j++) {
                ans.add(Character.toString((char) ('a' + i)));
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Main main = new Main();
        String[] str = {"bridgelabz", "brick", "bright"};
        main.array(str);
    }
}
