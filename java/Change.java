import java.util.Scanner;

public class Change {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("10진수->2진수 : 숫자 1입력");
        System.out.println("2진수->10진수 : 숫자 2입력");
        System.out.print("\r메뉴선택 : ");

        int select = sc.nextInt();

        switch(select) {
            case 1:
                System.out.print("2진수로 표현할 10진수 입력 : ");
                int inputDec = sc.nextInt();
                System.out.printf("\r변환 결과 : " + DecimalToBinary.DToB(inputDec));
                break;

            case 2:
                System.out.print("10진수로 표현할 2진수 입력 : ");
                String inputBi = sc.next();
                System.out.printf("\r변환 결과 : " + BinaryToDecimal.BToD(inputBi));
                break;
        }
    }
}
