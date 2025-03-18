package org.scoula.프로그래머스.숫자찾기;

//풀이1
public class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}

//풀이2
//public class Solution {
//    public int solution(int num, int k) {
//        int n = String.valueOf(num).indexOf(String.valueOf(k));
//        return n==-1?-1:n+1;
//    }
//}

//풀이3
//public class Solution {
//    public int solution(int num, int k) {
//        String s = String.valueOf(num);
//
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) - '0' == k){
//                return i + 1;
//            }
//        }
//        return -1;
//    }
//}