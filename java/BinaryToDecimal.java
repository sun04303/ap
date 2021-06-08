public class BinaryToDecimal {
    public static int BToD(String inputBinary) {
        int col = 0, binary = 2, output = 0, i = inputBinary.length() - 1;
        while (col < inputBinary.length()) {
            int digitNum = Integer.parseInt(inputBinary.substring(col, col+1));
            System.out.println(digitNum*(int)Math.pow(binary, i));
            output = output+(digitNum*(int)Math.pow(binary, i));
            i--;
            col++;
        }

        return output;
    }
}
