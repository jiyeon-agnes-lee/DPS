import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int maxN = nums.length / 2;

        // 중복 제거 후 종류 개수 파악을 위해 
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
          set.add(num);

        // 중복을 제거한 종류가 maxN보다 많으면 maxN를, 작으면 종류 개수를 리턴
        if (set.size() > maxN)
          return maxN;
        else return set.size();
    }
}
