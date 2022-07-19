import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++)
            arr[i] = Integer.toString(numbers[i]);
        // 내림차순 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        //000..방지
        if(arr[0].equals("0")) return "0";
        for(String str : arr)
            sb.append(str);
        return sb.toString();
    }
}
