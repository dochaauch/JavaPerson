package basicJava.lesson221026;

public class Test221026 {

    public int[][] fillArray(int length, int width){
        int[][] array = new int[length][width];
        fillLength(array, isCube(array));
        if(isCube(array)){
            fillCubeOne(array);
        } else fillNonCube(array);
        return null;
    }

    private boolean isCube (int[][] array) {
        //
        return true;
    }

    private int[][] fillLength(int[][] array, boolean isCube) {
        if (isCube) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = array.length;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = 10;
                }
            }
        }
    return array;
    }

    private void  fillCubeOne(int[][] array){

    }

    private void  fillNonCube(int[][] array){

    }
}