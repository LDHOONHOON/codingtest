package org.scoula.프로그래머스.n의배수고르기;

import java.util.*;

//풀이1
public class Solution {
    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                temp.add(numlist[i]);
            }
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}

//Array변환 사용코드
//public class Solution {
//    public int[] solution(int n, int[] numlist) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int item : numlist){
//            if(item % n == 0){
//                result.add(item);
//            }
//        }
//        return result.stream().mapToInt(x -> x).toArray();
//    }
//}