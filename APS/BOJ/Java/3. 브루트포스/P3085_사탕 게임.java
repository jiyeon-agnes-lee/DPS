import java.util.Scanner;
class Main {
    static char[][] box;
    static int maxCnt;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        box = new char[N][N];
        for(int i = 0; i < N; i++){
            String inputV = sc.next();
            for(int j =0; j < N ;j++) {
                box[i][j] = inputV.charAt(j);
            }
        }
        maxCnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1 ;j++) {
                // 가로 체크
                char tmp = box[i][j];
				box[i][j] = box[i][j+1];
				box[i][j+1] = tmp;
				
				// 최대 사탕 체크
				checkBox();
				
				// 복구
				tmp = box[i][j];
				box[i][j] = box[i][j+1];
				box[i][j+1] = tmp;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1 ;j++) {
                // 세로 체크
                char tmp = box[j][i];
				box[j][i] = box[j+1][i];
				box[j+1][i] = tmp;
				
				// 최대 사탕 체크
				checkBox();
				
				// 복구
				tmp = box[j][i];
				box[j][i] = box[j+1][i];
				box[j+1][i] = tmp;
            }
        }
        System.out.println(maxCnt);
        sc.close();
    }

    public static void checkBox(){
        // 가로
        for(int i = 0; i < N; i++) {
            int cnt = 1;
            for(int j = 0; j < N-1; j++){
                if(box[i][j] == box[i][j+1]) cnt++;
                else cnt = 1;
                maxCnt = maxCnt < cnt ? cnt : maxCnt;
            }
        }
        // 세로
        for(int i = 0; i < N; i++) {
            int cnt = 1;
            for(int j = 0; j < N-1;j++){
                if(box[j][i] == box[j+1][i]) cnt++;
                else cnt = 1;
                maxCnt = maxCnt < cnt ? cnt : maxCnt;
            }
        }
    }
}
