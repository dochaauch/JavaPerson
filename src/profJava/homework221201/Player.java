package profJava.homework221201;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/*Переписать нашу игру ( с лигами ) след образом.
У нас есть класс игроки ✅
У игроков есть имена и возраст ✅

Есть Энам который хранит лиги ✅

Есть класс который хранит в листе всех игроков  ✅

Есть класс который проводит игру среди игроков одной лиги ✅

Каждый игрок в каждой лиге должен сыграть 25 раз со своей же лигой ✅

Есть метод который считает очки у каждого игрока ✅


Вам необходимо написать все это  + метод который будет брать из нашего листа игрокови
проводить с ними игру в одной лиге так что бы все сыграли одинаковое количество раз. ✅
После того как отыграют все игроки в каждой лиге, надо найти трех лидеров в каждой лиге и если
ЕСТЬ ВОЗМОЖНОСТЬ ПЕРЕМЕСТИТЬ ЛИДЕР В ЛИГУ ВЫШЕ СДЕЛАТЬ ЭТО ЕСЛИ НЕТ ТО НЕ НАДО.

Найти трех лузеров и если есть возможносмть переместить в лигу ниже то сделать это.

Прогнать такую игру 5 раз и вывести на экран
Тех кто заработал больше всего очков ✅
Тех кто перешел в лигу выше
Тех кто перешел в лигу ниже

В каждой лиге минимум 25 человек ✅
Сделать класс который генерирует Участников - использовать faker библиотеку ✅
Лиг минимум 3 ✅
*/
@Getter
@Setter
@ToString

public class Player {
    private String name;
    private int age;
    private League league;
    private int scoreRound;
    private int scoreTotal;
    private UUID playerId;
    private Map gamesTimes;
    private int totalCountGames;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.league = League.START;
        this.scoreRound = 0;
        this.scoreTotal = 0;
        this.playerId = UUID.randomUUID();
        this.gamesTimes = new TreeMap<String, Integer>(); //для сортировки по ключам
        this.totalCountGames = 0;
    }

    public void addTotalScore() {
        scoreTotal = scoreTotal + scoreRound;
        scoreRound = 0;
    }

    public void addRoundScore(int delta) {
        scoreRound = scoreRound + delta;
    }

    public void updateGameTime(String gameName) {
        gamesTimes.put(gameName, gamesTimes.containsKey(gameName) ? (int) gamesTimes.get(gameName) + 1 : 1);
    }

    public void printPlayer() {
        System.out.println(String.format("Player: %-15s  age: %d  league: %-12s, scoreRound: %3d,  scoreTotal: %3d, gameCount: %3d, gameTime: %s",
                this.getName(), this.getAge(), this.league, this.getScoreRound(), this.getScoreTotal(), this.getTotalCountGames(), this.gamesTimes));
    }
}

class ComparePlayerByRoundScoreDecr implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o2.getScoreRound() - o1.getScoreRound();
    }
}

class ComparePlayerByTotalScoreDecr implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o2.getScoreTotal() - o1.getScoreTotal();
    }
}

