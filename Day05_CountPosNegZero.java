public class Day05_CountPosNegZero {
    public static void main(String[] args) {

        int[] arr = {-2, 5, 0, -1, 3, 0};

        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pos++;
            else if (arr[i] < 0)
                neg++;
            else
                zero++;
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
