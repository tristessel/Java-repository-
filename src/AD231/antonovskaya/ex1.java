package AD231.antonovskaya;

public class ex1 {
    public static boolean arrayAscending(int[] array){
        if (array.length < 2) {
            return false;
    }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {3, 2, 1};

        System.out.println(arrayAscending(testArray1));
        System.out.println(arrayAscending(testArray2));
    }
}
