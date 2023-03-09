package profJava.lesson230215.synch.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class EXCHANGER {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        //написать метод, который будет генерить Action
        //и передавать его в конструктор (без листа)
        //каждый раз будут выигрывать разные игроки

        //написать метод, который принимает в качестве
        //значения кол-во игроков, которые должны создаться
        //и сыграть друг с другом на победу play(7)
        //что-то сделать с нечетным
        List<Action> myList = new ArrayList<>();
        myList.add(Action.SCISSORS);
        myList.add(Action.SCISSORS);
        myList.add(Action.PAPER);

        List<Action> opList = new ArrayList<>();
        opList.add(Action.PAPER);
        opList.add(Action.STONE);
        opList.add(Action.PAPER);

        //сделать для 4, турнир для победителей

        new Player("P1", myList, exchanger);
        new Player("P2", opList, exchanger);

        //play(4) собрать в один метод и запустить
    }

}


enum Action {
    STONE,
    SCISSORS,
    PAPER
}


class Player extends Thread{
    private String name;
    private List<Action> actionList ;

    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
        this.start();
    }

    //добавить вывод проигравшего

    private void getWinner(Action my, Action op){
        if(my == Action.SCISSORS && op == Action.PAPER ||
        my == Action.STONE && op == Action.SCISSORS ||
        my == Action.PAPER && op == Action.STONE) {
            System.out.println(name + " ---> IS WINNER");
        }
    }
    @Override
    public void run(){
        Action reply; //вспом переменная для ротации
        for (Action action: actionList) {//какое-то значение, потом второй поток
            try {//два варианта
                reply = exchanger.exchange(action);//exchanger общий, производит обмен, a1
                getWinner(action, reply);//тут action a2 и reply action a1
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}