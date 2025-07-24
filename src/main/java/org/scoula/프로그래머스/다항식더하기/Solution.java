package org.scoula.프로그래머스.다항식더하기;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String solution(String polynomial) {
        int xTerm = 0;
        int constant = 0;

        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xTerm += 1;
                } else {
                    xTerm += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (xTerm > 0) {
            if (xTerm == 1) {
                result.append("x");
            } else {
                result.append(xTerm).append("x");
            }
        }

        if (constant > 0) {
            if (result.length() > 0) {
                result.append(" + ").append(constant);
            } else {
                result.append(constant);
            }
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
