package org.scoula.프로그래머스.세개의구분자;

import java.util.*;

public class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("[abc]");
        List<String> resultList = new ArrayList<>();

        for (String str : temp) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        if (resultList.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return resultList.toArray(new String[0]);
    }
}
