public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int x = 20;
        int n1 = 0;
        int n2 = 1;

        for (int i = x; i > 0; i--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }
}
