public class Armstrong2 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int originalNum = i;
            int sum = 0;
            int temp = i;  // Use temp variable

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (originalNum == sum) {
                System.out.println(originalNum);
            }
        }
    }
}
