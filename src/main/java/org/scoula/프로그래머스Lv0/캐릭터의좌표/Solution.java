package org.scoula.프로그래머스Lv0.캐릭터의좌표;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xBound = board[0] / 2;
        int yBound = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (answer[1] < yBound) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > -yBound) {
                        answer[1]--;
                    }
                    break;
                case "left":
                    if (answer[0] > -xBound) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if (answer[0] < xBound) {
                        answer[0]++;
                    }
                    break;
            }
        }
        return answer;
    }
}
