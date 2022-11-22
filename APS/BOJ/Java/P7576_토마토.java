import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TomatoLoc {
	int m;
	int n;

	TomatoLoc(int n, int m) {
		this.n = n;
		this.m = m;
	}
}

public class Main {

	static int m, n;
	static int[][] box;
	static int[] dn = { -1, 1, 0, 0 };// 상 하 좌 우
	static int[] dm = { 0, 0, -1, 1 };// 상 하 좌 우
	static Queue<TomatoLoc> queue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		queue = new LinkedList<>();
		box = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				box[i][j] = sc.nextInt();
				if (box[i][j] == 1) {
					queue.offer(new TomatoLoc(i, j));
				}
			}
		}
		System.out.println(findTomatoDays());
	}


	public static int findTomatoDays() {
		while(!queue.isEmpty()) {
			TomatoLoc tomato = queue.poll();
			for(int i = 0; i< 4; i++) {
				int nn = tomato.n + dn[i];
				int nm = tomato.m + dm[i];
				if(nm >= 0 && nm < m && nn >= 0 && nn < n) {
					if(box[nn][nm] == 0) {
						queue.offer(new TomatoLoc(nn, nm));
						box[nn][nm] = box[tomato.n][tomato.m]+1;
					}
				}
			}
		}
		int days = Integer.MIN_VALUE;
		for(int i =0; i < n; i++) {
			for(int j = 0; j < m; j++) {
					if(box[i][j] == 0) return -1;
					days = Math.max(days, box[i][j]);
			}
		}
		if(days == 1) return 0;
		else return days-1;
	}

}
