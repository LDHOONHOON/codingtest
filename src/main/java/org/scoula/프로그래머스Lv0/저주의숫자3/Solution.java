package org.scoula.프로그래머스Lv0.저주의숫자3;

//풀이1
public class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}

//풀이2
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int count = 0;
//        int i = 1;
//
//        while(count != n){
//            if(i % 3 != 0 && i % 10 != 3 && (i / 10) % 10 != 3){
//                answer = i;
//                count++;
//            }
//
//            i++;
//        }
//
//        return answer;
//    }
//}
