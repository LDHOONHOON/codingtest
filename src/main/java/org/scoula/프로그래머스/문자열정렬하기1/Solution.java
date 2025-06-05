package org.scoula.프로그래머스.문자열정렬하기1;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");

        String[] arr = my_string.split("");
        int[]answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}
