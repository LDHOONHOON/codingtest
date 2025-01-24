package org.scoula.프로그래머스.커피심부름;

public class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str:order) {
            if(str.contains("cafelatte")) {
                answer+=5000;
            } else {
                answer+=4500;
            }
        }
        return answer;
    }
}
