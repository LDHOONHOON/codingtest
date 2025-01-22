package org.scoula.프로그래머스.PCCE.홀짝에따라다른값반환하기;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        if(n%2 == 0) {
            return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
        }
        return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
    }
}