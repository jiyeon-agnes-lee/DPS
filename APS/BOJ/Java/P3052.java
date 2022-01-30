import java.util.HashSet;
import java.util.Scanner;

public class P3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
    // HashSet은 중복이 없다.
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i = 0; i<10;i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int i = 0; i<10; i++) {
			s.add(arr[i]);
		}
		
		System.out.println(s.size());
	}

}
