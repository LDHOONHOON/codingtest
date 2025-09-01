package org.scoula.프로그래머스Lv0.문자열밀기;

//풀이1
public class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        if(A.equals(B)){
            return answer;
        }

        char[] a = A.toCharArray();
        String str = "";
        int len = a.length;
        int count = 0;

        while(len != count){
            str = String.valueOf(a[len-1]);

            for(int i = 0; i < len-1; i++){
                str += a[i];
            }

            answer++;

            if(str.equals(B)){
                return answer;
            }

            a = str.toCharArray();
            count++;
        }

        answer = -1;
        return answer;
    }
}

//풀이2
//public class Solution {
//    public int solution(String A, String B) {
//        int answer = -1;
//        String temp = A;
//        for(int i = 0 ; i < A.length() ; i++){
//            if(temp.equals(B)){
//                answer = i;
//                break;
//            }
//            temp = temp.charAt(A.length()-1) + temp.substring(0, A.length()-1);
//
//        }
//        return answer;
//    }
//}


