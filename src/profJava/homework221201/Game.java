package profJava.homework221201;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    public static void printListPlayers(List<Player> players) {
        System.out.println("*****");
        for (Player player : players) {
            player.printPlayer();
        }
    }


    public void makeGame(List<Player> players, int nr) {
        List<Player> bestWorst = new ArrayList<>();
        for (int i = 0; i < players.size() - 1; i++) {
            Player firstPlayer = players.get(i); //чтобы не выбирать его много раз во внутр.цикле
            String gameName = "" + nr + firstPlayer.getLeague().getNumber();
            for (int j = i + 1; j < players.size(); j++) {
                Player secondPlayer = players.get(j);
                resultGame(firstPlayer, secondPlayer, gameName);
            }
        }
        processGamesTimes(players);
        Collections.sort(players, new ComparePlayerByRoundScoreDecr());
        //printListPlayers(players);
        for (int i = 0; i < 3; i++) {
            bestWorst.add(players.get(i));
        }
        for (int i = players.size() - 3; i < players.size(); i++) {
            bestWorst.add(players.get(i));
        }
        //printListPlayers(bestWorst);
        updateLeague(bestWorst);
        updateTotalScore(bestWorst);
    }

    public void resultGame(Player firstPlayer, Player secondPlayer, String gameName) {
        if (Math.random() > 0.5) {
            secondPlayer.addRoundScore(1);
        } else {
            firstPlayer.addRoundScore(1);
        }
        firstPlayer.updateGameTime(gameName);
        secondPlayer.updateGameTime(gameName);
    }

    public void updateLeague(List<Player> playerList) {
        changeLeague(playerList, 0, 3, 1, "up");
        changeLeague(playerList, 3, 6, -1, "down");
        //printListPlayers(playerList);
    }

    private static void changeLeague(List<Player> playerList, int start, int end, int change, String upDown) {
        for (int i = start; i < end; i++) {
            Player p = playerList.get(i);
            int leagueNumber = p.getLeague().getNumber();
            if (upDown.equals("down")) {
                if (leagueNumber > 1) {
                    p.setLeague(League.getLeagueByNumber(leagueNumber + change));
                }
            } else {
                if (leagueNumber < 5) {
                    p.setLeague(League.getLeagueByNumber(leagueNumber + change));
                }
            }
        }
    }

    private void updateTotalScore(List<Player> players) {
        for (Player player : players) {
            player.addTotalScore();
        }
    }

    public static void processGamesTimes(List<Player> allPlayers) {
        for (Player player : allPlayers) {
            ArrayList<Integer> gameCountList = new ArrayList<Integer>(player.getGamesTimes().values());
            int sum = 0;
            for (int i : gameCountList) {
                sum += i;
            }
            player.setTotalCountGames(sum);
        }
    }

    public static void checkLeague(List<Player> allPlayers) {
        ArrayList<Player> upList = new ArrayList<>();
        ArrayList<Player> downList = new ArrayList<>();
        for (Player player : allPlayers) {
            ArrayList<String> gameNrList = new ArrayList<String>(player.getGamesTimes().keySet());
            Integer firstL = Character.getNumericValue(gameNrList.get(0).charAt(1));
            Integer lastL = player.getLeague().getNumber();
            if (firstL < lastL) {
                upList.add(player);
            } else if (firstL > lastL) {
                downList.add(player);
            } else {
                System.out.print("");
            }
        }

        System.out.println("***");
        System.out.println("List with upgrades");
        for (int i = 0; i < upList.size(); i++) {
            System.out.println(i+1 + ". ");
            upList.get(i).printPlayer();
        };
        System.out.println("***");
        System.out.println("List with downgrades");
        for (int i = 0; i < downList.size(); i++) {
            System.out.println(i+1 + ". " );
            downList.get(i).printPlayer();
        };

    }
}
