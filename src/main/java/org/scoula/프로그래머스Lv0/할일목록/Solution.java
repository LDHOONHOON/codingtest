package org.scoula.프로그래머스Lv0.할일목록;

import java.util.*;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}