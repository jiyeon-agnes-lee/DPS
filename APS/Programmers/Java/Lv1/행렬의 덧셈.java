class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a1 = arr1.length;
        int a2 = arr1[0].length;
        int[][] answer = new int[a1][a2];
        for(int y=0; y< a2; y++){
            for(int x=0; x<a1; x++){
                answer[x][y] = arr1[x][y]+arr2[x][y];
            }
        }
        return answer;
    }
}
