package AD231.antonovskaya;

public class ex3 {
        public static boolean canSplit(int[] array) {
            int totalSum = 0;
            for (int num : array) {
                totalSum += num;
            }

            if (totalSum % 2 != 0) {
                return false;
            }

            int halfSum = totalSum / 2;
            int currentSum = 0;

            for (int num : array) {
                currentSum += num;

                if (currentSum == halfSum) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            int[] array1 = {1, 1, 1, 2, 1};
            int[] array2 = {2, 1, 1, 2, 1};

            System.out.println(canSplit(array1));
            System.out.println(canSplit(array2));
        }

}

