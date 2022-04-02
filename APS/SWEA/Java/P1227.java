import java.util.Scanner;

public class P1227 {
	static int[][] map;
	static int[] ed;
	static int ans;
	static int N = 100;
	// 좌상우하 탐색
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			ans = 0;
			int t = sc.nextInt();
			map = new int[N][N];
			// 끝점 찾기
			ed = new int[2];
			for (int i = 0; i < N; i++) {
				char[] cArr = sc.next().toCharArray();
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(String.valueOf(cArr[j]));
					if (map[i][j] == 3) {
						ed[0] = i;
						ed[1] = j;
					}
				}
			}
			// 도착지점부터 출발
			DFS(ed[0], ed[1]);
			System.out.println("#" + t + " " + ans);

		}
	}

	public static void DFS(int x, int y) {
		// 시작점에 도착하면 답 1로 바꾸고 main으로 돌아가
		if (map[x][y] == 2) {
			ans = 1;
			return;
		}

		// 이미 방문함 표시
		map[x][y] = 1;

		// 좌상우하 탐색
		for (int i = 0; i < 4; i++) {
			if ((x + dx[i] >= N || x + dx[i] < 0 || y + dy[i] >= N || y + dy[i] < 0))
				continue;
			if (map[x + dx[i]][y + dy[i]] == 1)
				continue;
			// 재귀호출
			DFS(x + dx[i], y + dy[i]);

		}
	}
}
