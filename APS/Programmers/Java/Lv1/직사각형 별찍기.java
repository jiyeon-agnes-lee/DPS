import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int c = 0; c < b; c++){
            for(int d = 0;d<a;d++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
