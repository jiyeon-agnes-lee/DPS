import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1267 {
	// 정점 개수, 간선 개수
	static int V, E;
	// 그래프 관계를 위한 인접 리스트
	static ArrayList<Integer>[] G;
	// 해당 노드를 가리키는 간선 개수 배열 (진입차수 배열)
	static int[] indegree;
	// 간선 개수가 0이된 노드를 담기위한 queue
	static Queue<Integer> Q;
	// 결과 출력은 위한 문자열 생성
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			// StringBuilder 초기화
			sb.setLength(0);
			// 출력문 기본 요소 입력
			sb.append("#").append(tc);
			V = sc.nextInt(); // 정점은 1번부터 V번까지
			E = sc.nextInt();
			G = new ArrayList[V + 1];
			// 정점 별 객체 생성
			for (int i = 1; i <= V; i++) {
				G[i] = new ArrayList<>();
			}
			// 진입차수배열 초기화
			indegree = new int[V + 1];

			for (int i = 0; i < E; i++) {
				int st = sc.nextInt();
				int ed = sc.nextInt();
				// 간선 연결 정보 입력
				G[st].add(ed);
				// 정점 진입 차수 증가
				indegree[ed]++;
			}

			topologicalSort();
			System.out.println(sb);
		}
	}

	static void topologicalSort() {
		Q = new LinkedList<Integer>();
		// 큐에 간선 개수가 0인, 즉 indegree가 0인 노드 담기
		for (int i = 1; i <= V; i++) {
			if (indegree[i] == 0) {
				Q.add(i);
			}
		}

		// 큐가 빌 때까지 반복
		while (!Q.isEmpty()) {
			// 큐에서 값을 꺼내서 해당 노드가 가리키는 노드들의 간선을 끊어준다. (간선 개수 1 감소)
			int node = Q.poll();
			for (int i = 0; i < G[node].size(); i++) {
				int idx = G[node].get(i);
				indegree[idx]--;
				// 만약 해당 노드를 가리키는 간선의 개수(indegree)가 0이되면 큐에 넣는다.
				if (indegree[idx] == 0)
					Q.add(idx);
			}
			// 결과 출력문에 추가
			sb.append(" ").append(node);
		}
	}
}
