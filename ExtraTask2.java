public class ExtraTask2 {
    public static void main(String[] args) {
        int[] ar = new int []{6, 5, 8, 10};

        int[] arr= new int []{3, 5, 7, 12};

        int sum1 = 0;
        int sum2 = 0;


        for (int j : ar) {
            sum1 += j;
        }
        System.out.println(sum1);

        for (int j : arr) {
            sum2 += j;
        }
        System.out.println(sum2);

        int sum3 = sum2 + sum1;

        System.out.println(sum3);
    }
}
