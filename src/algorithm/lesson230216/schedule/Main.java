package algorithm.lesson230216.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        demoGPT();
        demoMaksim();

    }

    private static void demoMaksim() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 3));
        activities.add(new Activity(1, 7));
        activities.add(new Activity(2, 4));
        activities.add(new Activity(5, 9));
        activities.add(new Activity(4, 6));
        activities.add(new Activity(7, 8));


        List<Activity> selectedActivities = schedulingActivitiesMaksim(activities);

        System.out.println("Selected activities: ");
        for (Activity activity : selectedActivities) {
            System.out.println("[" + activity.getStart() + ", " + activity.getEnd() + "]");
        }
    }

    private static void demoGPT() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 4));
        activities.add(new Activity(3, 5));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(3, 8));
        activities.add(new Activity(5, 9));
        activities.add(new Activity(6, 10));
        activities.add(new Activity(8, 11));
        activities.add(new Activity(8, 12));
        activities.add(new Activity(2, 13));
        activities.add(new Activity(12, 14));

        List<Activity> selectedActivities = schedulingActivitiesGPT(activities);

        System.out.println("Selected activities: ");
        for (Activity activity : selectedActivities) {
            System.out.println("[" + activity.getStart() + ", " + activity.getEnd() + "]");
        }
    }

    /*Идея алгоритма:
    выбираем активность, которая заканчивается раньше всех и не пересекается с уже выбранными.
    * Если две активности заканчиваются в одно время, то выбираем ту, которая длительнее.
    Второстепенный критерий - заявки должны использовать как можно больше времени*/
    //space complexity O(n)
    //time complexity O(n) +  O(n log n) =>  O(n log n)


    public static List<Activity> schedulingActivitiesGPT(List<Activity> activities) {
        // Sort the activities by end time
        Collections.sort(activities, Comparator.comparingInt(Activity::getEnd)
                .thenComparing(Comparator.comparingInt(Activity::duration).reversed()));

        List<Activity> selectedActivities = new ArrayList<>();
        Activity lastSelectedActivity = null;

        // Select the activities that end first and do not overlap with each other
        for (Activity activity : activities) {
            if (lastSelectedActivity == null || activity.getStart() >= lastSelectedActivity.getEnd()) {
                selectedActivities.add(activity);
                lastSelectedActivity = activity;
            }
        }
        return selectedActivities;
    }
    public static List<Activity> schedulingActivitiesMaksim(List<Activity> activities) {
        //сортируем по времени окончания
        activities.sort(Comparator.comparingInt(Activity::getEnd));

        List<Activity> selected = new ArrayList<>();

        //выбираем первую (ту, которая заканчивается раньше всех)
        Activity first = activities.get(0);
        //время окончания выбранной активности
        int lastEndTime = first.getEnd();
        selected.add(first);

        for (int i = 1; i < activities.size(); i++) {
            //условия непересечения
            Activity current = activities.get(i);
            if(current.getStart() >=lastEndTime) {
                lastEndTime = current.getEnd();
                selected.add(current);
            }
        }

    return selected;
    }

}
