package org.scoula.백준.반복문.A더하기B빼기8;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }

        in.close();
    }
}