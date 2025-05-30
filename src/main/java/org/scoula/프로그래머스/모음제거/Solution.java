package org.scoula.프로그래머스.모음제거;

import java.util.*;

//풀이1
public class Solution {
    public String solution(String my_string) {
        String result = "";

        result = my_string.replaceAll("[aeiou]", "");

        return result;
    }
}

//풀이2
//public class Solution {
//    public String solution(String my_string) {
//
//        char[] arr = my_string.toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
//                sb.append(arr[i]);
//            }
//        }
//
//        return sb.toString();
//    }
//}