import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> closet = new HashMap<>();
        for(String[] cloth : clothes){
            String category = cloth[1];
            closet.put(category, closet.getOrDefault(category, 0)+1);
        }
        Set<String> categories = closet.keySet();
        for (String category : categories) {
            answer *= closet.get(category) + 1; // 입지 않는 경우 포함
        }
        return answer-1; // 아무것도 안입는 경우 제외
    }
}
