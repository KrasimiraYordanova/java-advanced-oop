package RandomArrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement() {
        // getting random number from the array of n elements
        int index = ThreadLocalRandom.current().nextInt(0, size());
        // return and remove the randomly selected element
        return remove(index);
    }
}
