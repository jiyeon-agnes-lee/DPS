class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        answer = lcm(arr);
        return answer;
    }

    public int lcm(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = gcd(arr[0], arr[1]); // 최대공약수
        int lcm = (arr[0] * arr[1]) / gcd; // 최소공배수

        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }

    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
}
