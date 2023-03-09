package algorithm.lesson230216.profit;

import java.util.*;
/*
    Дано n заданий, где каждое задание имеет крайний срок и стоимость.
    Также известно, что каждое задание занимает одну единицу времени,
    поэтому минимально возможный крайний срок для любого задания равен 1.
    Как максимизировать общую прибыль,
    если единовременно может быть запланировано только одно задание.

    Алгоритм
        Сортируем по стоимости.
        Заполняем слоты для выполнения работы в порядке уменьшения стоимости,
        если позволяют дедлайны.

     start - первый день, когда мы готовы брать задачи
     end - последний день, когда мы готовы брать задачи
     */

public class Main {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("r", 1, 120));
        jobs.add(new Job("b", 2, 10));
        jobs.add(new Job("c", 2, 40));//
        jobs.add(new Job("d", 2, 30));
        jobs.add(new Job("a", 4, 20));//
        jobs.add(new Job("aa", 5, 5));
        jobs.add(new Job("e", 6, 60));//
        jobs.add(new Job("f", 8, 90));//
        //дедлайн - последний возможный день выполнения задания включительно


        //мы готовы брать задачи в дни 2, 3, 4, 5
        //List<Job> result = maximizeReward(jobs, 2, 5);
//        System.out.println("Our reward " + result.stream()
//                .mapToDouble(Job::getReward).sum());
//        System.out.println(result);
    }

//    public static List<Job> maximizeReward(List<Job> jobs, int start, int end) {
//        //сортируем по награде
//        jobs.sort(Comparator.comparingDouble(Job::getReward).reversed());
//
//        boolean[] slots = new boolean[end - start + 1];
//        Job[]
//
//        //List<Job> selected = new ArrayList<>();
//
//        for (int i = 0; i < jobs.size(); i++) {
//            Job job = jobs.get(i);
//            if(job.getDeadline() >= start) {
//                for (int j = slots.length - 1; j >= 0 ; j--) {//j это день,в кот.мы пытаемся запланировать работу
//                    if(slots[j] == false && (j + start) <= job.getDeadline() ) {
//                        slots[j] = true;
//                        selected.set(j, job);
//                        break;
//                    }
//                }
//            }
//        }
//        return List.of(selected);
//    }

}