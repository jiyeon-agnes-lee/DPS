import java.util.Scanner;

public class P13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i <n; i++) {
			a[i] = sc.nextInt(); 
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		long ans = 0;
		for(int i=0; i <n; i++) {
			a[i] = a[i] -b;
			ans++;
			if(a[i] > 0) {
				ans += a[i]/c;
				if(a[i] % c != 0) {
					ans++;
				}
			}
			
		}
		System.out.println(ans);
	}
}
