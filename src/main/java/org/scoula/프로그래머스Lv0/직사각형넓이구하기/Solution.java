package org.scoula.프로그래머스Lv0.직사각형넓이구하기;

public class Solution {
    public int solution(int[][] dots) {
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int[] dot : dots) {
            maxX = Math.max(maxX, dot[0]);
            minX = Math.min(minX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
            minY = Math.min(minY, dot[1]);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}
