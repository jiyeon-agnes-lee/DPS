import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P5658
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

// 아래부터는 직접 작성한 코드
    int[] testCases = new int[T];
        
		for(int test_case = 0; test_case < T; test_case++) {
				// 입력받은 N 과 K
	      int N = sc.nextInt();
        int K = sc.nextInt();
				// 한 변에 올 수 있는 개수 (N은 4의배수)
        int n = N/4;
				// 공백없이 입력되는 N개의 16진수 수를 String으로 입력받는다.
        String numList= sc.next();
				
				// 0회전과 n회전의 생성되는 수는 동일하다.
				// idx가 0번째부터 시작이고, 한 칸씩 시계방향으로 이동하면 총 n-1개의 문자가 추가된다.
				// 마지막 n-1개의 글자를 자르기 위해 시작 idx를 글자 길이인 N에서 (n-1)을 뺀 N+1-n로 둔다.
        String plusNum = numList.substring(N+1-n);
        // n회전하고 난 후 생성되는 추가 문자는 기존의 문자열 앞에 붙인다.
				numList = plusNum.concat(numList);
				// 중복을 제거하기 위해 HashSet을 활용한다.
        HashSet<Integer> nSet = new HashSet<>();
				// n개씩 글자를 묶어 잘라야 하므로, 
				// 새로 생성한 문자열의 길이에서 n만큼 빼준 idx까지 포함하여 반복
        for(int j = 0; j <= numList.length()-n; j++) {
						 // idx j 부터 j+n 까지 substring을 하면 j~j+n-1번째 글자까지의 문자열 생성
             String temp = numList.substring(j, j+n);
						 // 생성한 문자열은 16진수에서 10진수로 변경
             int t = Integer.parseInt(temp,16);
						 // 중복 제거를 위해 HashSet에 추가
             nSet.add(t);
        }
				// 중복이 제거된 생성된 숫자 리스트를 재생성
        List<Integer> nList = new ArrayList<>(nSet);
				// 내림차순 정렬을 위해 정수 배열 생성
        Integer[] nums = new Integer[nList.size()];
				// 리스트를 배열로 변환
        for(int k = 0; k < nList.size(); k++) {
             nums[k] = nList.get(k);
        }
				// 내림차순 정렬
        Arrays.sort(nums, Collections.reverseOrder());
				// K번째로 큰 숫자를 선택하기 위해 idx는 0부터 시작하므로 idx가 K-1인 수를 testCases리스트에 추가
        testCases[test_case] = nums[K-1];
	   } // 이 과정을 T번 반복
		 // 반복 후 생성된 testCases를 # i (번째테스트케이스의) K번째큰수 형태로 출력
		 // idx를 맞추기 위해 1부터 T번째까지 반복, testCases의 idx는 0번째부터 시작이므로 -1
     for(int i =1; i <= T; i++) {
        System.out.println("#"+ i + " " + testCases[i-1]);
     }
	}
}
