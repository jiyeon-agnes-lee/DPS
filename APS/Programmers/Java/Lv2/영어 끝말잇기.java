import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int idx = 0;
        HashSet<String> set = new HashSet<>();
        char preC = 'a';
        for(int i = 0; i < words.length; i++){
            if(idx == n) idx = 0;
            String word = words[i];
            int len = word.length();
            int size = set.size();
            // 1. 중복체크를 위해 set에 넣는다.
            set.add(word);
            idx++;
            if(i == 0) {
                preC = word.charAt(len-1);
                continue;
            }
            // 2. 조건 체크
            if(word.charAt(0) != preC || size == set.size() || len == 1){
                answer[0] = idx;
                answer[1] = i/n + 1;
                break;
            }
            preC = word.charAt(len-1);
        }
        return answer;
    }
}
