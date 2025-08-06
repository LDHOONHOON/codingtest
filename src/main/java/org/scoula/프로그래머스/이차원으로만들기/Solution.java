package org.scoula.프로그래머스.이차원으로만들기;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;

        for(int i = 0; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) {
                answer [i][j] = num_list[index++];
            }
        }
        return answer;
    }
}
