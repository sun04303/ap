import java.util.Scanner;

public class OddEven {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\r홀수와 짝수를 판별하는 프로그램입니다.");
        System.out.println("몇 개의 숫자를 입력하시겠습니까 : ");

        int time = sc.nextInt();
        for(int i = 1; i<=time; i++) {
            System.out.println(i + "번 째 숫자를 입력해주세요 : ");
            int num = sc.nextInt();

            if(num % 2 == 0) System.out.println(i + "번 째 숫자" + num + "는 짝수입니다.\r");
            else System.out.println(i + "번 째 숫자" + num + "는 홀수입니다.\r");
        }
        sc.close();
    }
}