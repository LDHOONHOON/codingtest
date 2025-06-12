package org.scoula.프로그래머스.컨트롤제트;

import java.util.*;

//풀이1
//1. 주어진 문자열 s를 공백을 기준으로 split을 사용하여 나눈 후, 문자열 배열 lists에 저장한다.
//2.반복문으로 각 요소를 반복하며
//3. 조건문으로 현재 요소가 Z와 같다면, 이전 요소를 뺀다.
//4. 그렇지 않으면 각 요소들을 더해 결과값을 반환한다.

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] lists = s.split(" ");

        for(int i = 0; i < lists.length; i++) {
            if(lists[i].equals("Z")) {
                answer -= Integer.parseInt(lists[i - 1]);
            } else {
                answer += Integer.parseInt(lists[i]);
            }
        }
        return answer;
    }
}

//풀이2 stack활용
//public class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        Stack<String> stack = new Stack<>();
//        for(String str : s.split(" "))
//        {
//            if(str.equals("Z"))
//            {
//                stack.pop();
//            }
//            else{
//                stack.push(str);
//            }
//        }
//
//        while(!stack.isEmpty())
//        {
//            answer+=Integer.parseInt(stack.pop());
//        }
//
//        return answer;
//    }
//}

//풀이3
//public class Solution {
//    public int solution(String s) {
//        String[] sArray = s.split(" ");
//        int result = 0;
//        for (int i = 0; i < sArray.length; i++) {
//            if (sArray[i].equals("Z")) {
//                result -= Integer.parseInt(sArray[i - 1]);
//                continue;
//            }
//            result += Integer.parseInt(sArray[i]);
//        }
//        return result;
//    }
//}