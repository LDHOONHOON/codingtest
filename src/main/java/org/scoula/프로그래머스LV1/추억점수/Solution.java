package org.scoula.프로그래머스LV1.추억점수;

import java.util.*;

//해쉬풀이
public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            //photo에 그리운 이름이 들어가 있다면
            for(String s : photo[i]){
                if(map.containsKey(s)){
                    sum += map.get(s);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}

//완전 탐색
//public class Solution {
//    public int[] solution(String[] name, int[] yearning, String[][] photo) {
//        int[] answer = new int[photo.length];
//
//        for(int i = 0; i<photo.length; i++){
//            for(int j = 0; j<photo[i].length; j++){
//                for(int h = 0; h<name.length; h++){
//                    if(photo[i][j].equals(name[h])){
//                        answer[i] += yearning[h];
//                        break;
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
//}