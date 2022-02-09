import java.util.Scanner;

public class P1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =0; tc < T; tc++) {
			int tIdx = sc.nextInt();
			int[] scores = new int[1000];
			int[] scoNums = new int[101];
			for(int i =0; i<1000; i++) {
				int score = sc.nextInt();
				scores[i] = score;
				scoNums[score]++;
			}
			int maxNum = 0;
			int scoIdx = 0;
			for(int i=1; i < 101; i++) {
				if (maxNum < scoNums[i]) {
					maxNum = scoNums[i];
					scoIdx = i;
				}else if(maxNum == scoNums[i]) {
					if(scoIdx < i) {
						scoIdx = i;
					}
				}else {
					continue;
				}
			}
			System.out.println("#"+tIdx+" "+scoIdx);
		}

	}
