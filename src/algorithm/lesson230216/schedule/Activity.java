package algorithm.lesson230216.schedule;

/*Идея алгоритма:
выбираем активность, которая заканчивается раньше всех и не пересекается с уже выбранными.
* Если две активности заканчиваются в одно время,  то выбираем ту, которая длительнее*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Activity {
    private int start;
    private int end;

    public int duration(){
        return getEnd()-getStart();
    }
}

