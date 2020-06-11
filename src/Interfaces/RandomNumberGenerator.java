package Interfaces;

import java.util.Random;

public interface RandomNumberGenerator {

    static int randomBetween(int start, int end) {
        Random random = new Random();

        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }
}
