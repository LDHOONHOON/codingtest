package org.scoula.프로그래머스Lv0.뒤에서5등위로;

import java.util.*;

public class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int n = 5;
        int[] answer = new int[num_list.length-n];
        for(int i=n; i<num_list.length; i++){
            answer[i-n]=num_list[i];
        }

        return answer;
    }
}
