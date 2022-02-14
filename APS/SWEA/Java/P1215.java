package com.ssafy.swea;

import java.util.Scanner;

public class P1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 1;
		for(int tc =1; tc <= T; tc++) {
			int len = sc.nextInt();
			int ans = 0;
			char[][] arr = new char[8][8];
			for(int i = 0; i < 8; i++) {
				String s = sc.next();
				for(int j=0;j<8;j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			String t = "";
			for(int i = 0; i<8; i++) {
				StringBuilder t1 = new StringBuilder();
				StringBuilder t2 = new StringBuilder();
				for(int j =0; j<8; j++) {
					// 행 
					t1.append(arr[i][j]);
					// 열
					t2.append(arr[j][i]);
				}
				// 행에서 회문 찾기
				t= t1.toString();
				ans += palindrome(len, t);
				// 열에서 회문 찾기
				t= t2.toString();
				ans += palindrome(len, t);
			}
			System.out.println("#" + tc + " "+ ans);
		}
	}
	public static int palindrome(int len, String t) {
		// 회문 수
		int value = 0;
		// 올바른 문장
		String s = "";
		// 뒤집은 문장
		String sRvs = "";
		for(int i =0; i < 8-len+1; i++) {
			// len 개수의 문자로 이루어진 문장 만들기
			StringBuilder str = new StringBuilder();
			for(int j=0; j < len; j++) {
				str.append(t.charAt(i+j));
			}
			s = str.toString();
			sRvs = str.reverse().toString();
			// 회문인지 확인하고 회문 수 ++
			if(s.equals(sRvs)) value++;
		}
		return value;
	}

}
