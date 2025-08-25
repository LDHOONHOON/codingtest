package org.scoula.프로그래머스.모스부호1;

public class Solution {
    public String solution(String letter) {
        String answer = "";

        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."
        };

        int ascii = 97;
        String[] alphabets = letter.split(" ");
        for (String alphabet : alphabets) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(alphabet)) {
                    answer += (char)(ascii + i);
                }
            }
        }

        return answer;
    }
}
