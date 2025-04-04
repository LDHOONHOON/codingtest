package org.scoula.프로그래머스.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] abc = my_string.toLowerCase().split("");

        Arrays.sort(abc);

        for (int i = 0; i < abc.length; i++) {
            answer += abc[i];
        }

        return answer;
    }
}