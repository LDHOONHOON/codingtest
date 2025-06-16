package org.scoula.프로그래머스.숨어있는숫자의덧셈2;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numStr = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr += c;
            } else {
                if (!numStr.isEmpty()) {
                    answer += Integer.parseInt(numStr);
                    numStr = "";
                }
            }
        }
        if (!numStr.isEmpty()) {
            answer += Integer.parseInt(numStr);
        }
        return answer;
    }
}
