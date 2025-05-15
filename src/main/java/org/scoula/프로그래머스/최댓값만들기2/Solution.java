package org.scoula.프로그래머스.최댓값만들기2;

import java.util.*;

//풀이1 Math.max() 메소드를 이용
public class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}

//풀이2

//publci class Solution {
//    public int solution(int[] numbers) {
//        Arrays.sort(numbers);
//
//        int max1=numbers[0]*numbers[1];
//        int max2=numbers[numbers.length-2]*numbers[numbers.length-1];
//
//        int answer=max1>max2?max1:max2;
//        return answer;
//    }
//}

//정수 배열을 오름차순으로 정렬한다.
//두 수가 양수일 경우 가장 큰 수끼리 곱한다(max2).
//두 수가 음수일 경우 가장 작은 수끼리 곱한다(max1).
//max1과 max2 중 큰 수가 answer



