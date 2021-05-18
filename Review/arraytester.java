package Review;
public class arraytester {
    /**THIS IS WRONG
     * public static int[] getColumn(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length];
        for (int col = 0; col < arr2D[0].length; col++) {
            for (int row = 0; row < arr2D.length; row++) {
                if (row == c) {
                    result[row] = arr2D[row][col];
                }
            }
        }
        return result;
    }*/ 

    public static int[] getColumnn(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++) {
            result[r] = arr2D[r][c];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arrd = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
        int[] columni = getColumnn(arrd, 2);
        for (int i : columni) {
            System.out.println(i);
        }
    }
}
