import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int idx = 0 ; idx < commands.length; idx++) {
            int i = commands[idx][0]-1;
            int j = commands[idx][1]-1;
            int k = commands[idx][2]-1;
            ArrayList<Integer> list = new ArrayList<>();
            for(int cnt = i;cnt <= j;cnt++)
              list.add(array[cnt]);  
            Collections.sort(list);
            answer[idx] = list.get(k);
        }
        return answer;
    }
}
