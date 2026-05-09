package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX_Ball_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor().name(), random.nextInt(MAX_Ball_NUMBER + 1));
    }
}
