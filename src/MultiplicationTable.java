public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        int num = 5;

        System.out.println("Table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
