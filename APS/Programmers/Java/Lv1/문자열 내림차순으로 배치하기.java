import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < s.length(); i++)
            sb.insert(0, arr[i]);
        answer = sb.toString();
        return answer;
    }
}
