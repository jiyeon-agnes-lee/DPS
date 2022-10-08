import java.util.ArrayList;

class Solution {
    static ArrayList<String> list;
    public int solution(int n, String[] data) {
        // 방법 경우의 수
        list = new ArrayList<String>();
        int answer = 0;
        String str = "ACFJMNRT";
        boolean[] visited = new boolean[8];
        // 프렌즈 수 : 8
        // n : 조건 data의 개수  
        // 0 : 조건 제시 프렌즈
        // 1 : ~
        // 2 : 상대방 프렌즈
        // 3 : = < > 같음 미만 초과
        // 4 : 0~6 두 프렌즈 사이 다른 프렌즈 수
        // 순열 
        perm(str, "", visited, 0);
        // 조건 확인
        for(String c : list) {
            boolean flag = true;
            loop : for(int i = 0 ; i < n; i++) {
                String condition = data[i];
                char f1 = condition.charAt(0);
                char f2 = condition.charAt(2);
                int dist = Math.abs(c.indexOf(f1) - c.indexOf(f2));
                int len = condition.charAt(4) - '0' +1;
                switch(condition.charAt(3)) {
                    case '=':
                        if(dist != len){
                            flag = false;
                            break loop;
                        }
                        break;
                    case '<':
                        if(dist >= len){
                            flag = false;
                            break loop;
                        }
                        break;
                    case '>':
                        if(dist <= len){
                            flag = false;
                            break loop;
                        }
                        break;
                }
            }
            if(flag)
                answer++;
        }
        return answer;
    }
	// 순열
	public static void perm(String str, String curr, boolean[] visited, int depth) {
	    if (curr.length() == 8) {
	    	list.add(curr);
	        return;
	    }
        if(depth == 8)
            return;  
	    for (int i = 0; i < 8; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            perm(str, curr + str.charAt(i), visited, depth + 1); 
	            visited[i] = false;
	        }
	    }
	}
}
