package org.scoula.프로그래머스.치킨쿠폰;

public class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int count = 0;

        while (coupon >= 10) {
            int leftCoupon = coupon % 10;
            count += coupon / 10;
            coupon = leftCoupon + coupon / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution chickenCoupon = new Solution();
        System.out.println(chickenCoupon.solution(100));    // 11
        System.out.println(chickenCoupon.solution(1081));    // 120
        System.out.println(chickenCoupon.solution(1999));    // 222
    }
}



//문제풀이2
//
//class Solution {
//    public int solution(int chicken) {
//        int service = 0;
//
//        while (chicken >= 10) {
//            service += chicken / 10;
//            chicken = (chicken / 10) + (chicken % 10);
//        }
//        return service;
//    }
//}