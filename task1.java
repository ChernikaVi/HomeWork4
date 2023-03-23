public class task1 {
    public static void main(String[] args) {

        String[][] arrayChess = new String[8][8];

        for (int i = 0; i < arrayChess.length; i++) {
            for (int j = 0; j < arrayChess[i].length; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("W" + " ");
                } else {
                    System.out.print("B" + " ");
                }
            }
            System.out.println();
        }
    }
}

