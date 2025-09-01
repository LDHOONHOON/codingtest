package org.scoula.프로그래머스Lv0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for(int i = 1; i < k; i++) {
            index += 2;
        }

        index %= numbers.length;
        answer = numbers[index];

        return answer;
    }
}

