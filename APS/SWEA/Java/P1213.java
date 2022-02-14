package com.ssafy.swea;

import java.util.Scanner;

public class P1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int tc =1; tc<= T; tc++) {
			int t = sc.nextInt(); 
			// 검색할 문자열-> 문자 배열로
			char[] pattern = sc.next().toCharArray();
			// 본문 문자열 -> 문자 배열로
			char[] text = sc.next().toCharArray();
			System.out.println("#"+t+ " "+ BruteForce(text, pattern));
		}

	}
	public static int BruteForce(char[] t, char[] p) {
		// 문자열 개수
		int value = 0;
		// 본문의 길이
		int N  = t.length;
		// 찾고자 하는 패턴의 길이
		int M = p.length;
		// 본문 길이 - 패턴의 길이 만큼 반복
		for(int i =0; i< N-M+1; i++) {
			// 찾았는지 여부 flag
			boolean flag = true;
			// 패턴만큼 반복
			for(int j =0; j< M; j++) {
				// 패턴과 본문이 동일하지 않으면
				if(p[j] != t[i+j]){
					// 찾았는지 여부 = false;
					flag = false;
					// 멈추기
					break;
				}
			}
			// 끝까지 반복하여 패턴과 동일한 문자열을 몇개 가지고 있는지 구한다.
			// 아직까지 flag가 true라는 것은 패턴을 찾았다는 의미로 value ++
			if(flag) {
				value++;
			// false 면 계속 반복하기	
			}else {
				continue;
			}
		}
		return value; 
	}
}
