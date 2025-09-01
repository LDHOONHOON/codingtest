package org.scoula.프로그래머스Lv0.유한소수판별기;

public class Solution {
    public int solution(int a, int b) {
        // 분모의 최대공약수를 구합니다.
        int gcd = gcd(a, b);
        b /= gcd;

        // 분모의 소인수를 2와 5로 나눕니다.
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // 분모에 2와 5 이외의 소인수가 남아있으면 무한소수이므로 2를 반환하고, 아니면 유한소수이므로 1을 반환합니다.
        return b == 1 ? 1 : 2;
    }

    // 최대공약수를 구하는 유클리드 호제법
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
