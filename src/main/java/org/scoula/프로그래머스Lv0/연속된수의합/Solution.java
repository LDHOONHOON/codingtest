package org.scoula.프로그래머스Lv0.연속된수의합;

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total * 2 / num - num + 1) / 2; // 시작 값 계산
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}


