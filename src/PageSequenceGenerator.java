import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Wojciech Okoński
 *         created on 02.05.2016 r.
 */
class PageSequenceGenerator {
    private final List<Integer> sequence = new LinkedList<>();
    private final int length;
    private final int numberOfPages;

    PageSequenceGenerator(int length, int numberOfPages) {
        this.length = length;
        this.numberOfPages = numberOfPages;
        generate();
    }

    private void generate() {
        for (int i = 0; i < length; i++) {
            sequence.add(new Random().nextInt(numberOfPages) + 1);
        }
    }

    List<Integer> getSequence() {
        return sequence;
    }
}
