package org.scoula.프로그래머스Lv0.꼬리문자열;

public class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String str : str_list) {
            answer += (str.indexOf(ex) == -1) ? str : "";
        }
        return answer;
    }
}
