package Interfaces;

import java.util.Random;

public interface RandomNumberGenerator {

    static int randomBetween(int start, int end) {
        Random random = new Random();

        int a1 = random.nextInt(end - start + 1);
        return a1 + start;
    }
}
