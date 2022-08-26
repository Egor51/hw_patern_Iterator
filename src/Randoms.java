import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    int max;
    int min;

    public Randoms(int min, int max) {
        random = new Random();
        this.max = max; //100
        this.min = min; //90
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int x = random.nextInt (max - min) + min ;
                return x;
            }
        };
    }
}