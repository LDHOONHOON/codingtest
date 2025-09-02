package org.scoula.프로그래머스LV1.덧칠하기;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0; // 덧칠 횟수
        int paintedArea = 0; // 현재 마지막으로 칠해진 영역의 끝 번호

        for (int sectionNum : section) {
            // 아직 칠해지지 않은 구역을 만났다면 칠하기 시작
            if (sectionNum > paintedArea) {
                answer++; // 덧칠 횟수 증가
                paintedArea = sectionNum + m - 1; // 롤러로 칠한 마지막 영역 업데이트
            }
        }
        return answer;
    }
}
