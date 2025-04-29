package org.scoula.프로그래머스.정사각형으로만들기;

//풀이1
public class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (row > col) {
            int[][] temp = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[i][j] = arr[i][j];
                }
                temp[i][col] = 0;
            }
            return temp;
        } else if (col > row) {
            int[][] temp = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    temp[j][i] = arr[j][i];
                }
                temp[row][i] = 0;
            }
            return temp;
        } else {
            return arr;
        }
    }
}

//풀이2
// public class Solution {
//    public int[][] solution(int[][] arr) {
//        int maxLen = arr.length > arr[0].length ? arr.length : arr[0].length;
//
//        int[][] answer = new int[maxLen][maxLen];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                answer[i][j] = arr[i][j];
//            }
//        }
//
//        return answer;
//    }
//}