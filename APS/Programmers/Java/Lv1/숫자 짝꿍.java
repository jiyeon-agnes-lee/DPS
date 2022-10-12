import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        ArrayList<Integer> list = new ArrayList<>();
        long[] xCnt = new long[10];
        long[] yCnt = new long[10];
        for(int x = 0 ; x < X.length(); x++) {
            xCnt[X.charAt(x)-'0']++;
        }
        for(int y = 0 ; y < Y.length(); y++) {
            yCnt[Y.charAt(y)-'0']++;
        }
        for(int i = 0 ; i < 10; i++) {
            long cnt = xCnt[i] >= yCnt[i] ? yCnt[i] : xCnt[i];
            for(int j = 0; j < cnt; j++) {
                list.add(i);
            }
        }
        int len = list.size();
        if(len == 0) {
            return "-1";
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        if(list.get(0) == 0) {
                return "0";
        }
        for(int i = 0; i < len; i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
