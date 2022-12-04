package profJava.homework221201;

import com.github.javafaker.Faker;

import java.util.Random;


public class Generator {
    private static Player createPlayer(int ageStart, int ageEnd) {
        Random random = new Random();
        Faker faker = new Faker();
        return new Player(faker.name().firstName(), random.nextInt(ageStart, ageEnd));
    }

    public static void createPlayers() {
        for (int i = 0; i < 25; i++) {
            PlayerManager.getInstance().addPlayer(Generator.createPlayer(10, 25));
        }
        for (int i = 0; i < 25; i++) {
            PlayerManager.getInstance().addPlayer(Generator.createPlayer(25, 45));
        }
        for (int i = 0; i < 25; i++) {
            PlayerManager.getInstance().addPlayer(Generator.createPlayer(45, 99));
        }
    }
}
