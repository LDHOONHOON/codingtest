package org.scoula.프로그래머스.주사위개수;

public class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}

