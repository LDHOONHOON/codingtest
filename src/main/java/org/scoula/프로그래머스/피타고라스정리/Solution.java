package org.scoula.프로그래머스.피타고라스정리;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a의 값 입력
        int c = sc.nextInt(); // b의 값 입력
        int b_square = (c*c) - (a*a); // b² = c² - a²
        System.out.println(b_square); // 결과 값 화면 출력
    }
}
