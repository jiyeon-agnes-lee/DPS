import java.util.Arrays;
import java.util.Scanner;

public class P11656 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int len = input.length();
		String[] arr = new String[len];
		for(int i=0; i<len; i++) {
			arr[i] = input.substring(i, len);
		}
		Arrays.sort(arr);
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
