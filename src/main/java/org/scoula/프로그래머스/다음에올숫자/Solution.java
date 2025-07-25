package org.scoula.프로그래머스.다음에올숫자;

public class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int n = common.length;

        // 등차수열인지 확인
        if (common[1] - common[0] == common[2] - common[1]) {
            // 등차수열인 경우
            answer = common[n - 1] + (common[1] - common[0]);
        } else {
            // 등비수열인 경우
            answer = common[n - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
