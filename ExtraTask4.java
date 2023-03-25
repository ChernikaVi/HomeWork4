import java.util.Arrays;
public class ExtraTask4 {
    public static void main(String[] args) {
        int arr[][] = new int[][] {{15, 23, 10, 25}, {30, 1, 5, 27}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Arrays.sort(arr[i]);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}