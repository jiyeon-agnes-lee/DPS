package com.ssafy.swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P1230 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =10;
		StringBuilder sb= new StringBuilder();
		for(int tc =1; tc <= T; tc++) {
			sb.setLength(0);
			sb.append("#"+tc);
			// 암호문 길이
			int N = Integer.parseInt(br.readLine());
			// 암호문 배열
			String[] sArr = br.readLine().split(" ");
			// 암호문을 넣을 단일연결리스트 
			LinkedList<String> slist = new LinkedList<>();
			// 암호문 넣기(순서대로 넣을 것이므로 마지막에 넣어주기)
			for(int i = 0; i <N; i++) {
				slist.add(sArr[i]);
			}
			// 명령어 개수
			int cmdNum = Integer.parseInt(br.readLine());
			// 명령어 배열(공백 기준 자르기)
			String[] cmdArr = br.readLine().split(" ");
			// 명령어 배열 인덱스
			int idx =0;
			// 명령어 전부 실행할 때 까지 반복
			while(cmdNum > 0) {
				// idx번의 명령어 배열의 값을 꺼낸다.
				String s = cmdArr[idx++];
				// 명령어를 확인하고 명령어를 실행한다.
				if(s.equals("I")) {
					// 명령어 다음 위치의 배열의 값은 x
					int x = Integer.parseInt(cmdArr[idx++]);
					// 그 다음 위치의 배열의 값은 y
					int y = Integer.parseInt(cmdArr[idx++]);
					// sArr 의 x 위치 바로 뒤에 y 번 반복해서
					for(int t =0; t<y; t++) {
						//x번 위치에 값을 넣어준다.
						slist.add(x++,cmdArr[idx++]);
						//x값 증가
					}
					// 명령어 실행횟수 감소
					cmdNum--;
				}else if(s.equals("D")){
					// 명령어 다음 위치의 배열의 값은 x
					int x = Integer.parseInt(cmdArr[idx++]);
					// 그 다음 위치의 배열의 값은 y
					int y = Integer.parseInt(cmdArr[idx++]);
					// sArr 의 x 위치 바로 뒤에 y 번 반복해서
					for(int t =0; t<y; t++) {
						//x번 위치의 값을 삭제한다.
						slist.remove(x++);
						//x값 증가
					}
					// 명령어 실행횟수 감소
					cmdNum--;
				}else if(s.equals("A")) {
					// 명령어 다음 위치의 배열의 값은 y
					int y = Integer.parseInt(cmdArr[idx++]);
					// sArr 맨 뒤에 y 번 반복해서
					for(int t =0; t<y; t++) {
						//값을 넣어준다.
						slist.add(cmdArr[idx++]);
					}	
					// 명령어 실행횟수 감소
					cmdNum--;
				}
			}
			// 수정된 암호문 배열의 앞 10개 출력
			for(int i = 0 ; i < 10; i++) {
				sb.append(" "+slist.get(i));
			}
			System.out.println(sb.toString());
		}
		br.close();
	}
}
