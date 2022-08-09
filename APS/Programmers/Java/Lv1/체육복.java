class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] student = new int[n+1];
        // 여분 가져왔는지 체크
        for(int i = 0 ; i < reserve.length; i++)
            student[reserve[i]]++;
        // 잃어버린거 체크
        for(int i = 0; i < lost.length; i++)
            student[lost[i]]--;
        // 빌려야 하는 학생들 앞뒤 친구들 확인
        for(int i = 1; i <= n; i++) {
            // 빌려야 하는 학생이면 -1 인 상태
            if(student[i] == -1){
                // 앞 학생이 있고, 그 학생이 자신의 것을 제외하고 빌려줄 수 있을 때
                if(i != 1 && student[i-1] > 0){
                    student[i-1]--;
                    student[i]++;
                    continue;
                }
                // 뒤 학생이 있고, 뒤 학생이 자신의 것을 제외하고 빌려줄 수 있을 때
                if(i != n && student[i+1] > 0){
                    student[i+1]--;
                    student[i]++;
                    continue;
                }
                // 빌릴 수 없을 때
                answer--;
            }
        }
        return answer;
    }
}
