package org.scoula.프로그래머스.진료순서정하기;

import java.util.*;

//풀이1) HashMap
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);

        Arrays.sort(emergencySort);
        int size = emergency.length;

        for(int i = 0; i<emergencySort.length; i++){
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}

//풀이2) 이중for문
//public class Solution {
//    public int[] solution(int[] emergency) {
//        // 입력 배열을 복제하여 정렬할 배열을 생성
//        int[] asc = emergency.clone();
//        // 결과를 저장할 배열 생성
//        int[] answer = new int[emergency.length];
//
//        // 복제한 배열을 오름차순으로 정렬
//        Arrays.sort(asc);
//
//        // asc 배열의 원소를 하나씩 탐색
//        for(int i=0; i<asc.length; i++) {
//            // emergency 배열의 원소를 하나씩 탐색
//            for(int j=0; j<emergency.length; j++) {
//                // asc의 원소와 emergency의 원소가 일치하면
//                if(asc[i]==emergency[j]) {
//                    // 결과를 저장하는 배열 answer에 저장
//                    answer[j]=emergency.length-i;
//                }
//            }
//        }
//        return answer;
//    }
//}