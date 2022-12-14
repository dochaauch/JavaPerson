package profJava.task221212;

import java.util.*;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        Map<League, List<Player>> map = new HashMap<>();
        map.put(League.LEAGUE1, new ArrayList<>(List.of(
                new Player("Vasia", 4),
                new Player("Vasia1", 6),
                new Player("Vasia2", 2),
                new Player("Vasia3", 14),
                new Player("Vasia4", 5)
        )));

        map.put(League.LEAGUE1, new ArrayList<>(List.of(
                new Player("Petya", 4),
                new Player("Petya1", 6),
                new Player("Petya2", 2),
                new Player("Petya3", 14),
                new Player("Petya4", 5)
        )));

        map.put(League.LEAGUE3, new ArrayList<>(List.of(
                new Player("Vova", 4),
                new Player("Vova1", 6),
                new Player("Vova2", 2),
                new Player("Vova3", 14),
                new Player("Vova4", 5)
        )));
    }


        private static Map<League, List<Player>> getLeaders(Map<League, List<Player>> players){
            Map<League, List<Player>> result =  new HashMap<>();

            players.forEach(new BiConsumer<League, List<Player>>() {
                @Override
                public void accept(League league, List<Player> players) {
                    players.sort(new Comparator<Player>() {
                        @Override
                        public int compare(Player o1, Player o2) {
                            return o2.getScore() - o1.getScore();
                        }
                    });
                    int thirdPlayerIndex = players.size() > 2 ? 2: players.size()-1;
                    result.put(league, new ArrayList<>(players.subList(0, thirdPlayerIndex)));
                }
            });
            return result;


            //players.ForEach((k,v) ->{
                //v.sort((p1, p2) -> p2.getScore() -p1.getScore());
                //int thirdPlayerIndex = v.size() >
                //result.put(k, new ArrayList<>(v.suList(0,2)));

            //})

    }
}
