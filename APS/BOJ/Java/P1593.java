import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int wLen = Integer.parseInt(st.nextToken());
		int sLen = Integer.parseInt(st.nextToken());
		
		String w = br.readLine();
		String s = br.readLine();
		
		int[] wArr = new int[52];
		int[] sArr = new int[52];
		
		for(char c : w.toCharArray()) {
			putWord(c, wArr, 1);
		}
		
		int stIdx = 0;
		int ans = 0;
		int size = 0;
		for(int i = 0; i < sLen; i++) {
			char sc = s.charAt(i);
			putWord(sc, sArr, 1);
			size++;
			if(size == wLen) {
				if(Arrays.equals(wArr, sArr)) {
					ans++;
				}
				putWord(s.charAt(stIdx), sArr, -1);
				stIdx++;
				size--;
			}
		}
		System.out.println(ans);

	}
	// diff = 1 이면 삽입, -1이면 삭제
	static void putWord(char word, int[] arr, int diff) {
		if('a' <= word && word <= 'z') {
			// 소문자 
			arr[word-'a'] += diff;
		}
		else {
			// 대문자
			arr[word-'A'+26 ]+= diff;
		}
	}
}
