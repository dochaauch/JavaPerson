package basicJava.homework221024;
/*двумерный массив h w
* заполнять числами по спирале*/

public class twoDimArray220124 {

    public static int[][] get(int h, int w) {
        int[][] array = new int[h][w];
        int count = 1;
        int currentSection = 0;
        int startPosRow = 0;
        int endPosRow = w-1;
        int startPosCol = 1;
        int endPosCol = h-1;
        int maxLength = 0;
        String format = "";
        int temp = 0;

        int maxCount = h * w;


            while (count < (h * w) +1) {
                // проходим строку слева направо
                for (int j = startPosRow; j <= endPosRow; j++) {
                    array[currentSection][j] = count;
                    count++;
                }
                if (count > maxCount) {
                    break;
                }
                currentSection = endPosRow;
                endPosRow = endPosRow - 1;

                // проходим столбец сверху вниз
                for (int i = startPosCol; i <= endPosCol; i++) {
                    array[i][currentSection] = count;
                    count++;
                }
                if (count > maxCount) {
                    break;
                }
                currentSection = endPosCol;
                endPosCol = currentSection - 1;


                // проходим строку справа налево
                for (int j = endPosRow; j >= startPosRow; j--) {
                    array[currentSection][j] = count;
                    count++;
                }
                if (count > maxCount) {
                    break;
                }
                currentSection = startPosRow;
                startPosRow = startPosRow + 1;

                // проходим столбец снизу вверх
                for (int i = endPosCol; i >= startPosCol; i--) {
                    array[i][currentSection] = count;
                    count++;
                }
                if (count > maxCount) {
                    break;
                }
                currentSection = startPosCol;
                startPosCol = startPosCol+1;
            }

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
        return array;
    }

    public static void main(String[] args) {
        get(10, 20);
    }
}