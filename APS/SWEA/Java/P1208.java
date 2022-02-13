import java.util.Scanner;
 
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
         
        for(int tc =1; tc <= T; tc++) {
            // 이동 수 
            int dump = sc.nextInt();
            // 최대 높이
            int maxH = 100;
            // 최저 높이
            int minH = 1;
            // box의 높이별 개수 배열
            int[] boxH = new int[101];
            for(int r = 0; r <100; r++) {
                boxH[sc.nextInt()]++;
            }
            // 카운팅 정렬
            //  dump가 0이상이고, 최저 높이와 최대 높이의 차가 1 이내 일 때까지 반복
            while(dump>=0 && minH<maxH-1) {
                // 최대 높이의 박스 개수가 0이 되면 최대 높이의 idx 하나 이동
                if(boxH[maxH] == 0) {
                    maxH--;
                    continue;
                }
                // 최소 높이의 박스 개수가 0이 되면 최소 높이의 idx 하나 이동
                if(boxH[minH] == 0) {
                    minH++;
                    continue;
                }
                // 최대 높이의 박스 개수가 하나 줄어들면
                boxH[maxH]--;
                // 최대 높이 -1의 박스 개수가 하나 증가되고, 
                boxH[maxH-1]++;
                // 최소 높이의 박스 개수가 하나 줄어들면
                boxH[minH]--;
                // 최소 높이 +1의 박스 개수가 하나 증가된다.
                boxH[minH+1]++;
                // 이동 횟수 감소
                dump--;
            }
            // 모든 이동이 끝났을 때 최대 높이 - 최소 높이 차 구하여 출력
            System.out.println("#"+tc+ " " + (maxH-minH));              
        }
    }
 
}
