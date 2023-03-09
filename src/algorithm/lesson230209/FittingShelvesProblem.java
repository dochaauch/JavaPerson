package algorithm.lesson230209;
/*Для заданной длины стены w и полок двух длин m и n
найдите количество используемых полок каждого типа
и оставшееся пустое пространство в оптимальном решении,
чтобы пустое пространство было минимальным.
Большая из двух полок дешевле, поэтому она предпочтительнее.
Однако стоимость второстепенна, и первоочередной задачей
является минимизация пустого пространства на стене.*/
public class FittingShelvesProblem {
    /*idea 1
        try maximum number of the larger shelves
        try the rest with smaller shelves
        idea 2
        try to put the larger shelve
        calculate the remaining free space*/
    public static void fit(int w, int m, int n){
        int lesserLength = Math.min(m, n);
        int greaterLength =  Math.max(m, n);
        int wallLength = w;

        //временные переменные
        int tempLesserGhelvesNum = wallLength / lesserLength;
        int tempGreaterGhelvesNum = 0;
        int remainder = wallLength % lesserLength;

        // переменные для результата
        int numLesserShelves = tempLesserGhelvesNum;
        int numGreaterShelves = tempGreaterGhelvesNum;
        int minEmptySpace = remainder;

        while (wallLength >= greaterLength) {
            tempGreaterGhelvesNum++;
            wallLength -= greaterLength;

            tempGreaterGhelvesNum= wallLength / lesserLength;
            remainder = wallLength % lesserLength;

            if (remainder <= minEmptySpace) {
                numLesserShelves = tempLesserGhelvesNum;
                numGreaterShelves = tempGreaterGhelvesNum;
                minEmptySpace = remainder;
            }
        }
        System.out.printf("numLesserShelves %s, numGreaterShelves %s, minEmptySpace %s\n",
                numLesserShelves, numGreaterShelves, minEmptySpace);
    }

    public static void main(String[] args) {
        fit(6, 2,3);
        fit(7, 2,3);
        fit(9, 2,3);
    }
}
