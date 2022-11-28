import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int ans = (V-B) / (A-B);
		if((A-B)* ans +B < V) ans ++; 
		System.out.println(ans);
		sc.close();
	}
}
