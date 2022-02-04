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
		
		for(int i=0; i <n; i++) {
			if(a[i] - b <= 0) {
				a[i] = 0;
				System.out.println(i + " " + a[i]);
			}else if(a[i]-b <= c){
				a[i] = 1;
				System.out.println(i + " " + a[i]);	
			}else {
				a[i] = (int) Math.round((a[i] - b)/c *10)/10;
				System.out.println(i + " " + a[i]);
			}
			
		}
		
		int ans = n;
		for(int i=0;i<n;i++) {
			ans += a[i];
			System.out.println(i + " " + ans);
		}
		System.out.println(ans);
	}
}
