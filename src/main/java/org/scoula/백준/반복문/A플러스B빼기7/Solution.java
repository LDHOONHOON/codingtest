package org.scoula.백준.반복문.A플러스B빼기7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ")
                    .append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
        }
        System.out.println(sb);
    }
}

// 풀이2
//

// 풀이3
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        for (int i = 1; i <= a; i++) {
//            st = new StringTokenizer(br.readLine()," ");
//            System.out.println("Case #" + i + ": "
//                    +(Integer.parseInt(st.nextToken())
//                    +Integer.parseInt(st.nextToken())));
//        }
//        br.close();
//    }
//
//}
