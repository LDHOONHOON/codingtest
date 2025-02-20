package org.scoula.프로그래머스.배열조각하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}