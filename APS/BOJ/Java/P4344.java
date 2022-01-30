import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double[] pers = new double[c];
		for(int i =0; i <c;i++) {
			int n = sc.nextInt();
			int sum = 0;
			int[] arr = new int[n];
			for(int j = 0 ; j<n;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			double avg = (double) sum/n;
			int cnt =0;
			for(int k=0; k<n;k++) {
				if (arr[k] > avg) {
					++cnt;
				}
			}
			pers[i] = (double) cnt/n*100;
		}
		for(int i=0;i<c;i++) {
			System.out.printf("%.3f%%\n", pers[i]);
		}
	}
}
