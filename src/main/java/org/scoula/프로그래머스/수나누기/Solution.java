package org.scoula.프로그래머스.수나누기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 0;

        for (int i = 0; i < number; i++) {
            answer += number % 100;
            number /= 100;
        }
        System.out.println(answer);
    }
}
