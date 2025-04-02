package org.scoula.프로그래머스.잘라서배열로정렬하기;

// 풀이1
class Solution {
    public String[] solution(String my_str, int n) {
        int length=(int) Math.ceil((double)my_str.length()/n);  //my_str을 n으로 나누고 올림해서 int에 저장함
        String[] answer=new String[length];                     //길이가 length인 answer배열

        int index=0;
        for(int i=0; i<length-1; i++) {
            answer[i]=my_str.substring(index, n*(i+1));         //n번째 인덱스까지 잘라서 answer에 저장
            index+=n;
        }
        answer[length-1]=my_str.substring(index);

        return answer;
    }
}


// 풀이2
//class Solution {
//    public String[] solution(String my_str, int n) {
//		int length = 0;
//
//		if(my_str.length() % n > 0) {
//			length = (my_str.length() / n) + 1;
//		}else if(my_str.length() % n == 0) {
//			length = my_str.length() / n;
//		}
//
//		int a = my_str.length() / n; //길이 나눈값
//		int b = my_str.length() % n; //길이 나머지
//
//		String[] answer = new String[length];
//
//		int idx1 = 0;
//		int idx2 = n;
//
//		for (int i = 0; i <= a; i++) {
//			if(i==a & my_str.length() % n > 0) {
//				answer[a] = my_str.substring(idx1,my_str.length());
//				break;
//			}else if(i==a) {
//				break;
//			}
//			answer[i] = my_str.substring(idx1,idx2);
//			idx1 = idx1+n;
//			idx2 += n;
//		}
//
//        return answer;
//    }
//}
