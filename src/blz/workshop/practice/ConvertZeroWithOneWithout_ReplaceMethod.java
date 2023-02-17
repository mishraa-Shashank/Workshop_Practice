package blz.workshop.practice;

import java.util.ArrayList;
import java.util.List;

public class ConvertZeroWithOneWithout_ReplaceMethod {
    static void zeroConvert(ArrayList<String> arr) {
        System.out.println(List.of(arr));
        for (int i = 0; i < arr.size(); i++) {
            char[] ch = arr.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    ch[j] = '0';
                }
                arr.set(i, String.valueOf(ch));
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>(List.of("1100", "0011", "0001", "0000", "1111"));
        ConvertZeroWithOneWithout_ReplaceMethod.zeroConvert(stringArr);
    }
}