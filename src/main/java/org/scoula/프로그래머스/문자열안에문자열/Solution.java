package org.scoula.프로그래머스.문자열안에문자열;

public class Solution {
    public int solution(String str1, String str2) {
     int answer = 0;
        boolean result = str1.contains(str2);
     return result ? 1 : 2;
    }
}
