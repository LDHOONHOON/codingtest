package org.scoula.프로그래머스.중복된문자제거;

import java.util.*;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<String> set = new LinkedHashSet<>();

        String[] arr = my_string.split("");

        for(String s : arr) {
            set.add(s);
        }
        answer = String.join("", set);

        return answer;
    }
}