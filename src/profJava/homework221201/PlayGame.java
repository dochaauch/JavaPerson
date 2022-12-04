//package profJava.homework221201;
//
//import java.util.Random;
//
//public class PlayGame {
//    Player player;
//
//    public static void playGame(Player player1, Player player2){
//        Random random = new Random();
//        int res = random.nextInt(2);
//        System.out.println(res);
//        String win;
//        if(res == 1) {
//            player1.setScore(1);
//            win = player1.getName();
//        } else {
//            player2.setScore(1);
//            win = player2.getName();
//        }
//        System.out.println(String.format("Winner is %s", win));
//    }
//}
