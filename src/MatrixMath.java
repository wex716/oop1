public class MatrixMath {
    public int getSumMainDiagonal(int[][] array) {
        if(array.length != array[0].length){
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                if (i==j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
