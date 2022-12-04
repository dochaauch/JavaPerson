package profJava.homework221201;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString

public class PlayerManager implements Iterable<Player> {
    static PlayerManager pm = null; //singleton
    private List<Player> allPlayers = new ArrayList<>(); //или можно объявить в конструкторе

    private PlayerManager() {

    }

    static PlayerManager getInstance() {
        if (pm == null) {
            pm = new PlayerManager();
        }
        return pm;
    }

    private boolean assignLeague(Player player) {
        boolean res = true;
        if (player.getAge() >= 10 && player.getAge() <= 25) {
            player.setLeague(League.JUNIOR);
        } else if (player.getAge() >= 26 && player.getAge() <= 45) {
            player.setLeague(League.MIDDLE);
        } else if (player.getAge() >= 46 && player.getAge() <= 100) {
            player.setLeague(League.SENIOR);
        } else res = false;
        return res;
    }

    public boolean addPlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player.getPlayerId().equals(player1.getPlayerId())) {
                return false;
            }
        }
        if (assignLeague(player)) {
            allPlayers.add(player);
            //player.printPlayer();
        }
        return true;
    }

//    private static void setFirstLeague(PlayerManager playerManager) {
//        for (Player player : playerManager) {
//            if(player.getAge() <= 25){
//                player.setLeague(League.JUNIOR);
//            } else if (player.getAge() >25 && player.getAge() <= 45) {
//                player.setLeague(League.MIDDLE);
//            } else {
//                player.setLeague(League.PRIME);
//            }
//            System.out.println(String.format("League %s for %s is added", player.getLeague(), player.getName()));
//        }
//    }


//    public Player getPlayerByIndex(int idx) {
//        return (Player) allPlayers.get(idx);
//    }

    public List<Player> getPlayersByLeague(League league) {
        List<Player> leagueList = new LinkedList<>();
        for (Player player : allPlayers) {
            if (player.getLeague().equals(league)) {
                leagueList.add(player);
            }
        }
        return leagueList;
    }

    @Override
    public Iterator<Player> iterator() {
        return new PlayerIterator(allPlayers);
    }
}

class PlayerIterator implements Iterator<Player> {
    int idx = 0;
    List<Player> allPlayers;

    public PlayerIterator(List<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }

    @Override
    public boolean hasNext() {
        return idx < allPlayers.size();
    }

    @Override
    public Player next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return allPlayers.get(idx++);
    }
}
