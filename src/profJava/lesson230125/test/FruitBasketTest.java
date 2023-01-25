package profJava.lesson230125.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import profJava.lesson230125.ex.Fruit;
import profJava.lesson230125.ex.FruitBasket;

import java.util.NoSuchElementException;

class FruitBasketTest {

    private FruitBasket basket =new FruitBasket();
    private final Fruit apple = new Fruit("apple", 120);
    private final Fruit orange = new Fruit("orange", 100);
    private final Fruit pear = new Fruit("pear", 80);

    @BeforeEach
    public void init() {
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
    }

    @Test
    void testAdd() {
        basket.add(new Fruit("test", 1));
        Assertions.assertEquals(4, basket.size(),
                "Adding one more fruit");
    }

    @Test
    void testRemove() {
        basket.remove(orange);
        Assertions.assertEquals(2, basket.size(),
                "Removing a fruit from the basket");


    }

    @Test
    void testSize() {
        Assertions.assertEquals(3, basket.size(),
                "Checking basket size");
    }

    @Test
    void testRemoveException() {
        Assertions.assertThrows(NoSuchElementException.class,
                () -> basket.remove(new Fruit("kiwi", 3)),
                "Removing a fruit from the basket");
    }

    @Test
    void testRemoveAll() {
        basket.removeAll();
        Assertions.assertEquals(0, basket.size(),
                "Checking remove all");
    }

    @AfterEach
    public void destroy() {
        basket.removeAll();
    }

}