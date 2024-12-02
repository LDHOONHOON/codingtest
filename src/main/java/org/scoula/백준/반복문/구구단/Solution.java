package org.scoula.백준.반복문.구구단;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}