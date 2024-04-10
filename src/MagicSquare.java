import java.util.Arrays;

public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < array2d[0].length; i++){
            sum += array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        for(int i = 1; i < array2d.length; i++){
            int sum = 0;
            for(int j = 0; j < array2d[i].length; j++){
                sum += array2d[i][j];
            }
            if(sum==checkSum){
                //continue
            }
            else{
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        for(int i = 0; i < array2d.length; i++){
            int sum = 0;
            for(int j = 0; j < array2d[i].length; j++){
                sum += array2d[j][i];
            }
            if(sum==checkSum){
                //continue
            }
            else{
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int sum = 0;
        int check = 0;
        int z = 0;
        for(int i = 0; i < array2d.length; i++){
                sum += array2d[i][z];
                z++;
        }
        if(sum == checkSum) check++;
        z = array2d.length-1;
        sum = 0;
        for(int i = 0; i < array2d.length; i++){
            sum += array2d[i][z];
            z--;
        }
        if(sum == checkSum) check++;
        if(check==2) return true;
        else return false;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int sum = calculateCheckSum(array2d);
        if(magicRows(array2d, sum) == true && magicColumns(array2d, sum) == true && magicDiagonals(array2d, sum) == true) return true;
        else return false;
    }

}
