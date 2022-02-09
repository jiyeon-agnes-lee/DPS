import java.util.Scanner;

public class P1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t =1; t <= T; t++) {
			int max = 0;
			int min = 10000;
			double sum = 0;
			int[] nums = new int[10];
			for(int i =0; i<10; i++) {
				int num = sc.nextInt();				
				if(max < num) {
					max = num;
				}
				if(min > num) {
					min = num;
				}
				nums[i] = num;
				sum += num;
			}
			sum = sum - max - min;
			int avg = (int)(sum/8*10 +5)/10;
			System.out.println("#"+t+" "+avg);
		}

	}

}
