import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1337 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		
		int[] numList = new int[n];
		for(int j=0; j<n; j++) {
			for(int k=0 ; k<5;k++) {
				if(list.contains(list.get(j)+k)) {
					numList[j] += 1;
				}
			}
		}
		
		int max = numList[0];
		for(int i =1; i<n; i++) {
			if(max == 5) {
				break;
			}else if (max < numList[i]) {
				max = numList[i];
			}else {
				continue;
			}
		}
		System.out.println(5-max);
	}
}
