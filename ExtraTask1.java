public class ExtraTask1 {
    public static void main(String[] args) {
        int [][] arr = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 0, 0}};

        int [][] ar = {{1, 2, 3},{1, 1, 1},{0, 0, 0}, {2, 1, 0}};

        int a1 = arr.length;
        int a2 = ar[0].length;
        int a3 = ar.length;
        int[][] arr3 = new int[a1][a2];

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                for (int k = 0; k < a3; k++) {
                    arr3[i][j] += arr[i][k] * ar[k][j];

                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "   ");
            }
        }
    }
}
