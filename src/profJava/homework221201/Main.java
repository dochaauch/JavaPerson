package profJava.homework221201;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Generator.createPlayers();
        Game game = new Game();

        for (int i = 0; i < 5; i++) {
            for (League l : League.values()) {
                if(PlayerManager.getInstance().getPlayersByLeague(l).size() > 0)
                    game.makeGame(PlayerManager.getInstance().getPlayersByLeague(l), i+1);
            }
        }

        List<Player> allPlayers = PlayerManager.getInstance().getAllPlayers();
        Collections.sort(allPlayers, new ComparePlayerByTotalScoreDecr());

        System.out.println("***");
        System.out.println("Print players with max score");
        for (int i = 0; i < 3; i++) {
            allPlayers.get(i).printPlayer();
        }
        Game.checkLeague(allPlayers);
    }


}
