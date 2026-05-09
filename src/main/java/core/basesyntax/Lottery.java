package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 101;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Colors color = supplier.getRandomColor();
        int number = new Random().nextInt(maxNumber);
        Ball ball = new Ball(color.name(), number);
        return ball;
    }
}
