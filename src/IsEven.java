public class IsEven {
    public static void main(String[] args) throws Exception {
        int num = -140;
        String printStr = num + " is ";

        if(num % 2 == 0){
            printStr += "even and ";
        } else {
            printStr += "uneven and ";
        }

        if(num > 0){
            printStr += "positive.";
        } else {
            printStr += "negative.";
        }

        System.out.println(printStr);
    }
}