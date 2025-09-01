package org.scoula.프로그래머스Lv0.자릿수더하기;

//풀이1 while문 사용
public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 일의 자리부터 자릿수 더하기
            n /= 10;
        }
        return answer;
    }
}

//풀이2 split() 메소드 활용
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String [] arr = String.valueOf(n).split("");
//
//        for(String a : arr) {
//            answer += Integer.parseInt(a);
//        }
//        return answer;
//    }
//}
