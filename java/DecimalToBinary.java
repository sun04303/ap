public class DecimalToBinary {
    public static String DToB(int dec){
        int binary = 2;
        String output = "";
        while(((float)dec / (float)binary) >= 0.5) {
            System.out.println(dec%binary);
            output = dec % binary + output;
            dec /= binary;
        }
        return output;
    }
}
