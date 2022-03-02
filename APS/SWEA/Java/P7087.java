package com.ssafy.swea;

import java.util.Scanner;

public class P7087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1; tc<= T; tc++) {
			int N = sc.nextInt();
			int[] alphabet = new int[26];
			for(int i =0; i<N; i++) {
				alphabet[sc.next().charAt(0) - 'A']++;
			}
			int cnt =0;
			for(int i =0; i< 26; i++) {
				if(alphabet[i] == 0) break;
				else cnt++;
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
}
