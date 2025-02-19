package org.scoula.프로그래머스.qrcode;

public class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = r; i < code.length(); i += q) {
            answer.append(code.charAt(i));
        }

        return answer.toString();
    }
}
