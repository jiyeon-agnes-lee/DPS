class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // h편논문 : h번이상, n-h편논문 : h번이하
        // h의 최댓값 = answer
        int n = citations.length;
        int h = n;
        int cnt = 0;
        while(true) {
            for(int i = 0 ; i < n; i++) {
                int c = citations[i];
                // 인용횟수가 h 이상이면 cnt++ 
                if(c >= h)
                    cnt++;
            }
            if(h <= cnt) {
                answer = h;
                break;
            }else {
                h--;
                cnt = 0;
            }
        }
        return answer;
    }
}
