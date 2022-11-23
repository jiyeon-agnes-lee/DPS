import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] indegree = new int[N + 1];
		ArrayList<Integer>[] adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adjList[a].add(b);
			indegree[b]++;
		}

		topologicalSort(N, indegree, adjList);
		System.out.println(sb);

	}

	static void topologicalSort(int N, int[] indegree, ArrayList<Integer>[] adjList) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int i = 0; i < adjList[node].size(); i++) {
				int idx = adjList[node].get(i);
				indegree[idx]--;
				if (indegree[idx] == 0)
					queue.add(idx);
			}
			sb.append(node).append(" ");
		}

	}
}
