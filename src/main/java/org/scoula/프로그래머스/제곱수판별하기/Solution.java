package org.scoula.프로그래머스.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        if(Math.sqrt(n) % 1 == 0){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}
