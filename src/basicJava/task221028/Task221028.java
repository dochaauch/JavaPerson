package basicJava.task221028;

public class Task221028 {

    public static void main(String[] args) {
        int N = 4;
        int M = 4;
        int[][] matrix = new int[N][M];
        int x = 0;
        int y = 0;
        int countMax = (N * M) +1;
        int count = 1;
        boolean flagXY = true; //если false - пойдем направо
        while (count < countMax) {
            //y++;
            for (int i = 0; i < (flagXY? M:N); i++) {
                matrix[x][y] = count;
                count++;
                if(flagXY){
                    x++;
                } else {
                    y++;
                }

            }
            flagXY =!flagXY;
            System.out.println();
        }


    }
}
