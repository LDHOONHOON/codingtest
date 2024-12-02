package org.scoula.백준.반복문.A플러스B빼기3;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[T];       // 배열 생성

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;           // i의 길이만큼 가지고 있는 배열에 A + B 한 값을 담아주기
        }
        for (int C : arr) {           // C라는 변수에 arr 배열을 담아서 반복문으로 값 출력
            System.out.println(C);
        }
    }

}