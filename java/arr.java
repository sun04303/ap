import java.util.Scanner;

public class arr {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] row;
        row = new int[1];
        int[] col = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println("원하시는 곱셈표(구구단)를 입력해주세요 ");
        System.out.print("숫자입력 : ");
        row[0] = sc.nextInt();

        for(int i = 0; i<9; i++) {
            System.out.println(row[0] + " * " + col[i] + " = " + row[0] * col[i]);
        }
    }
}