class Solution {
    static int cnt;
    static int[] rArrows;
    static int maxDiff;
    static int[] answer;
    static int[] rInfo;
	  public int[] solution(int n, int[] info) {
        cnt = n;
        rArrows = new int[n];
        answer = new int[11];
        maxDiff = 0;
        
        dfs(0, 0, info);
        
        if(maxDiff == 0){
            int[] fail = {-1};
            return fail;
        }else return answer;
	  }
    
    private static void dfs(int start, int depth, int[] aInfo) {
        if(depth == cnt){
            rInfo = new int[11];
            
            for(int a : rArrows) {
                rInfo[10-a]++;
            }
            
            int rPoint = 0;
            int aPoint = 0;
            for(int j = 0 ; j < 11; j++) {
                if(aInfo[j] == 0 && rInfo[j] == 0){
                    continue;
                }else if(aInfo[j] >= rInfo[j]){
                    aPoint += 10-j;
                }else{
                    rPoint += 10-j;
                }
            }
            
            int diff = rPoint - aPoint;
            if(diff > 0) {
                if(maxDiff < diff){
                    maxDiff = diff;
                    for(int i = 0 ; i < 11; i++) {
                        answer[i] = rInfo[i];
                    }
                }
            }
            return;
        }
        for(int i = start ; i < 11; i++) {
            rArrows[depth] = i;
            dfs(i, depth+1, aInfo);
        }
    }
}
