package org.scoula.프로그래머스Lv0.A로B만들기;

import java.util.*;

public class Solution {
    public int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        return str1.equals(str2) ? 1 : 0;
    }
}