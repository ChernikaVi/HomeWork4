import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[][][] test = new int[3][3][2];

        for (int i = 0; i < test.length; i++) {
            for (int i1 = 0; i1 < test[1].length; i1++) {
                for (int j = 0; j < test[i][i1].length; j++) {
                    test[i][i1][j] = random.nextInt(10, 20);
                }
            }
        }
        System.out.println(Arrays.deepToString(test));

        int x = scan.nextInt();

        for (int i = 0; i < test.length; i++) {
            for (int i1 = 0; i1 < test[1].length; i1++) {
                for (int j = 0; j < test[i][i1].length; j++) {
                    test[i][i1][j] += x;
                }
            }
        }
        System.out.println(Arrays.deepToString(test));
    }
}