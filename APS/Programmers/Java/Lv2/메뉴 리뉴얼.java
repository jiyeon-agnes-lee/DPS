import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    static ArrayList<String> orderList;
    public String[] solution(String[] orders, int[] course) {
       
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < orders.length; i++) {
            char[] originOrder = orders[i].toCharArray();
            Arrays.sort(originOrder);
            int len = originOrder.length;
            orderList = new ArrayList<String>();
            powerset(originOrder, new boolean[len], len, 0);
            for(String order : orderList) {
                if(map.containsKey(order)) {
                    int cnt = map.get(order);
                    map.put(order, ++cnt);
                }else map.put(order, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < course.length; i++) {
            int courseLen = course[i];
            int maxOrderCnt = 0;
            for(String key : map.keySet()) {
                int cnt = map.get(key);
                if(cnt > 1 && courseLen == key.length()){
                    if(cnt > maxOrderCnt)
                        maxOrderCnt = cnt;
                }
            }
            for(String key : map.keySet()) {
                if(courseLen == key.length() && map.get(key) == maxOrderCnt)
                        list.add(key);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
    // 부분집합
    public static void powerset(char[] order, boolean[] visited, int len, int idx) {
        if(idx == len) {
            StringBuilder sb = new StringBuilder();
            for(int i= 0 ; i < len; i++) {
                if(visited[i])
                    sb.append(order[i]);
            }
            if(sb.length() >= 2)
                orderList.add(sb.toString());
            return;
        }
        visited[idx] = false;
        powerset(order, visited, len, idx+1);
        visited[idx] = true;
        powerset(order, visited, len, idx+1);
    }
}
