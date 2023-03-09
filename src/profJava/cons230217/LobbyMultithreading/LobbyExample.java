package profJava.cons230217.LobbyMultithreading;
/*Организовать серверное Лобби, в лобби добавляются игроки,
когда количество игроков больше определенного -
запускается сессия с этими игроками.
Игроки в лобби сортируются по количеству очков.
---
Ввести понятие лиг, базируясь на очках
0-500
500-1000
1000-1500
и чтобы пользователи из разных лиг не попадали в одну сессию
чтобы пользователи сортировались по очкам, но внутри своей лиги
*/

public class LobbyExample {
    public static void main(String[] args) throws Exception {
        Lobby lobby = new Lobby(5);
        while (true) {
            new Thread(() -> {
                User user = new User((int) Math.random() * 1000);
                lobby.addUser(user);
                try {
                    Thread.sleep((int) (Math.random() * 500) + 100); //чтобы не перегружать основной процесс созданием пользователя
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
