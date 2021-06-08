import java.util.Scanner;
public class maxmin {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int max = -2147483648;
        int min = 2147483647;

        System.out.println("입력 받은 숫자들의 최대값과 최소값을 판별");
        System.out.print("입력 숫자는 몇 개입니까? : ");
        int numbers = sc.nextInt();

        for (int i = 1; i<=numbers; i++) {
            System.out.print(i + "번째 숫자를 입력 : ");
            int num = sc.nextInt();

            if(num % 2 == 0) System.out.println(i + "번 째 숫자 " + num + "는 짝수입니다.\r");

            else System.out.println(i + "번 째 숫자 " + num + "는 홀수입니다.\r");

            if (num > max) max = num;

            if (num < min) min = num;
        }

        System.out.println("최대값은 " + max + " 최소값은 " + min + "입니다.");
        sc.close();
    }
}
