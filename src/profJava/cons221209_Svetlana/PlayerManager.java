package profJava.cons221209_Svetlana;

import java.util.*;

public class PlayerManager {
    //Use map which contains Key=League, Value = List of players
    //private List<Player> players;
    private Map<League, List<Player>> mapOfPlayers;
    static PlayerManager pm = null;
    private Set<UUID> uuids;

    private PlayerManager() {
        //players = new ArrayList<>();
        mapOfPlayers = new HashMap<>();
        for (League l : League.values()) { //инициализация map
            mapOfPlayers.put(l, new ArrayList<>());
        }
        uuids = new HashSet<>();
    }

    public static PlayerManager getInstance(){
        if(pm == null)
            pm = new PlayerManager();
        return pm;
    }

    //change method, player must add as key/value
    public boolean addIntoListPlayer(Player player){
        //определить в какую лигу относится игрок
        //in which league put player
        //old code
//        for (Player p : players) {
//            if(p.getId().equals(player.getId()))
//                return false;
//        }
        Boolean res = false;
        if(!uuids.contains(player.getId())){
            League league = assignLeague(player);
            if(assignLeague(player) != League.UNDEFINED){
                List<Player> players = mapOfPlayers.get(league); //получаем список по ключу в мапе
                players.add(player);
                uuids.add(player.getId());
                res = true;
            }
        }
            //players.add(player);
        return res;
    }

    //change name determinateLeague

    private League assignLeague(Player p){
        League res = League.UNDEFINED;
        if(p.getAge() >= 15 && p.getAge() <= 17){
            p.setLeague(League.JUNIOR);
            res = League.JUNIOR;
        }
        else if(p.getAge() >= 18 && p.getAge() <= 25){
            p.setLeague(League.MIDDLE);
            res = League.MIDDLE;
        }
        else if(p.getAge() >= 26 && p.getAge() <= 40){
            p.setLeague(League.SENIOR);
            res = League.SENIOR;
        }
        //else res = false;
        return res;
    }

    //use map instead list
    public List<Player> getPlayersByLeague(League league){
        //List<Player> listPlayers = mapOfPlayers.get(league);
        //List<Player> playersListByLeague = new LinkedList<>(listPlayers);
        //old code
//        for (Player p: players) {
//            if(p.getLeague().equals(league)){
//                playersListByLeague.add(p);
//            }
//        }
        //return playersListByLeague;
        return new LinkedList<>(mapOfPlayers.get(league));
    }
    
    public boolean changeLeague(Player player, League newLeague){
        boolean res = false;
        if(!player.getLeague().equals(newLeague)){
            List<Player> playersOldLeague = mapOfPlayers.get(player.getLeague());
            List<Player> playersNewLeague = mapOfPlayers.get(newLeague);
            Iterator<Player> it = playersOldLeague.iterator();
            while (it.hasNext() && !res == true){
                Player p = it.next();
                if(p.getId().equals(player.getId())) {
                    it.remove();
                    playersNewLeague.add(player);
                    res = true;
                }
            }
        }
        return res;
    }
}
