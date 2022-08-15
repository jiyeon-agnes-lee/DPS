class Solution {
    public int solution(int n) {
        int[] remain = new int[n+1];
        remain[0] = 0;
        remain[1] = 1;
        // 44번째 피보나치 수만 해도 정수의 범위를 넘는다.
        // 따라서 (A+B)%C = ((A%C)+(B%C))%C 의 성질을 활용한다. (모듈러 연산의 성질)
        // 이를 통해 int 로 처리 
        for(int i = 2; i< n+1; i++) {
            remain[i]= (remain[i-2] + remain[i-1]) % 1234567;
        }
        return remain[n];
    }
}
