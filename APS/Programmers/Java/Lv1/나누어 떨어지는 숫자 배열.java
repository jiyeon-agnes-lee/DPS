import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        if(divisor == 1)
            return arr;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i]%divisor == 0)
                list.add(arr[i]);
        }
        if(list.isEmpty())
            list.add(-1);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
