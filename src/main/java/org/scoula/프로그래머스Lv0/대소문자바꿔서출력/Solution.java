package org.scoula.프로그래머스Lv0.대소문자바꿔서출력;

import java.util.Scanner;

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c); // 알파벳이 아닌 경우 그대로 추가
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        Solution sol = new Solution();
        String result = sol.solution(my_string);
        System.out.println(result);
    }
}
