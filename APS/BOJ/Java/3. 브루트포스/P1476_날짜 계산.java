import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int answer = 1;
        if(e == 1 && s == 1 && m == 1) 
            System.out.println(answer);
        else {
            while(true){
                if((answer - e)%15 == 0 && (answer-s)%28 == 0 && (answer-m)%19 == 0){
                    System.out.println(answer);
                    break;
                }
                answer++;
            }  
        }

    }
}
