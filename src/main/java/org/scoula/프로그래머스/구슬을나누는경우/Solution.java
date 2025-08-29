package org.scoula.프로그래머스.구슬을나누는경우;

import java.math.BigInteger;

public class Solution {
    public BigInteger solution(int balls, int share) {
        // nCr = n! / (r! * (n-r)!)
        return factorial(balls)
                .divide(factorial(share).multiply(factorial(balls - share)));
    }

    // 팩토리얼 계산 함수
    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
