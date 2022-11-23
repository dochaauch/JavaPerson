package basicJava.homework221026;

public class Test221026_2 {
    public int[][] createArray(int length, int width) {
        int[][] array = new int[length][width];

        if (isCube(array)) {
            fillLength(array);
            diagonal(array);
        } else {
            fillNull(array);
            if (length == 1 || width ==1) {
                fillSectionOne(array);
            }
            else if (length < width) {
                superAlgorithmWidth(array);
            } else {
                superAlgorithmHeight(array);
            }
        }
        printOurArray(array);
        return array;
    }

    private int[][] fillSectionOne(int[][] array) {
        if (array.length > 1){
            for (int i = 0; i < array.length; i++) {
                array[i][0] = 1;
            }
        } else {
            for (int i = 0; i < array[0].length; i++) {
                array[0][i] = 1;
            }
        }
        return array;
    }


    private void printOurArray(int[][] array) {
        int maxLength = 0;
        String format = "";
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp = String.valueOf(array[i][j]).length();
                if (temp > maxLength) {
                    maxLength = temp;
                }
            }
        }

        format = "%" + maxLength + "d\t";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(format, array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    private int[][] superAlgorithmWidth(int[][] array) {
        int iPos  = 0;
        int jPos = 0;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            iPos = i;
            jPos = i;
        }
        int j = jPos - 1;
        for (int i = array.length; i < array[0].length; i++) {
            array[j][i] = 1;
            j--;
            iPos = j+1;
            jPos = i;
        }
        j = array[0].length - 2;
        for (int i = iPos-1; i > -1; i--) {
            array[i][j] = 1;
            j--;
            iPos = i;
            jPos = j + 1;
        }
        j = jPos -1;
        for (int i = iPos + 1; i < array.length; i++) {
            array[i][j]  = 1;
            j--;
        }
    return array;
    }

    private int[][] superAlgorithmHeight(int[][] array) {
        int iPos  = 0;
        int jPos = 0;
        for (int i = 0; i < array[0].length; i++) {
            array[i][i] = 1;
            iPos = i;
            jPos = i;
        }
        int j = jPos - 1;
        for (int i = array[0].length; i < array.length; i++) {
            array[i][j] = 1;
            j--;
            iPos = j+1;
            jPos = i;
        }
        j = jPos-1;
        for (int i = iPos-1; i > -1; i--) {
            array[j][i] = 1;
            j--;
            iPos = i;
            jPos = j + 1;
        }
        j = jPos -1;
        for (int i = iPos + 1; i < array[0].length; i++) {
            array[j][i]  = 1;
            j--;
        }
        return array;
    }

    private int[][] fillNull(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    private int[][] diagonal(int[][] array) {
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
                array[i][i] = 1;
                array[i][j] = 1;
                j--;
        }
        return array;
    }

    private int[][] fillLength(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = array.length;
            }
        }
        return array;
    }

    private boolean isCube(int[][] array) {
        if (array.length == array[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Test221026_2 test221026_2 = new Test221026_2();
        int[][] nonCubeArray = test221026_2.createArray(3, 4);
        int[][] nonCubeArray2 = test221026_2.createArray(7, 5);
        int[][] array = test221026_2.createArray(2, 2);
        int[][] array2 = test221026_2.createArray(1, 1);
        int[][] array3 = test221026_2.createArray(3, 1);
        int[][] array4 = test221026_2.createArray(1, 3);
        int[][] array5 = test221026_2.createArray(15, 8);
    }
}
