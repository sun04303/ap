import java.util.Scanner;

public class Multiple {

    static int start, startNum, endNum;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("시작과 끝 숫자 사이 짝수 모두 더함");
        System.out.print("시작 숫자를 입력하세요 : ");
        startNum = scan.nextInt();

        start = startNum;
        if(startNum % 2 == 1) startNum++;

        System.out.print("마지막 숫자를 입력하세요 : ");
        endNum = scan.nextInt();

        Multiple.conversion();

        int sum = Multiple.evenPrint(startNum, endNum);

        System.out.println(start + "부터" + endNum + "까지의 짝수의 합계 = " + sum);
        scan.close();
    }

    static void conversion() {
        if (endNum < startNum) {
            int temp;

            start = endNum;
            temp = startNum;
            startNum = endNum;
            endNum = temp;
        }
    }

    static int evenPrint(int start, int end) {
        int result = 0;

        for(int i = start; i<=end; i++) {
            if(i % 2 == 0) {
                result += i;
                System.out.println(i);
            }
        }

        return result;
    }
}