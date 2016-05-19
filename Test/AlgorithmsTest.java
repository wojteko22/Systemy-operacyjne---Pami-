import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Wojciech Okoński
 *         created on 03.05.2016 r.
 */
public class AlgorithmsTest {
    private List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 2, 1, 5, 6, 2, 1, 2, 3, 7, 6, 3, 2, 1, 2, 3, 6);

    @Test
    public void exampleSequenceTest() {
        FIFO fifo = new FIFO(sequence);
        assertThat(fifo.calculateAndPrint(4), is(14));

        LRU lru = new LRU(sequence);
        assertThat(lru.calculateAndPrint(4), is(10));

        Optimal optimal = new Optimal(sequence);
        assertThat(optimal.calculateAndPrint(4), is(8));
    }

}