package org.scoula.백준.조건문.오븐시계;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        h += t / 60;
        m += t % 60;

        if(m >= 60){
            h += 1;
            m -= 60;
        }
        if(h >= 24){
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
