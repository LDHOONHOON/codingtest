package org.scoula.프로그래머스.공백으로구분하기2;

import java.util.*;

public class Solution {
    public String[] solution(String my_string) {
        // 1. StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(my_string, " ");
        List<String> wordList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            wordList.add(st.nextToken());
        }
        return wordList.toArray(new String[0]);

        // 2. split() 사용 (정규표현식)
        // return my_string.trim().split("\\s+");

        // 3. split() 사용 (replaceAll 사용)
        // return my_string.replaceAll("^\\s+", "").split("[ ]+");
    }
}
