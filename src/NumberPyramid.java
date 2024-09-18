public class NumberPyramid {
    public static void main(String[] args) throws Exception {
        int num = 9;

        for (int i = 1; i <= num; i++) {
            StringBuilder printStr = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                printStr.append(i);
            }
            System.out.println(printStr);
        }
    }
}
