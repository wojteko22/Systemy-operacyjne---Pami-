import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Wojciech Okoński
 *         created on 03.05.2016 r.
 */
class LRU extends Algorithm {
    private List<Integer> timeStamps;
    private int time = 0;

    LRU(List<Integer> sequence) {
        super(sequence);
    }

    int calculateAndPrint(int numberOfFrames) {
        timeStamps = new ArrayList<>(numberOfFrames);
        for (int i = 0; i < numberOfFrames; i++) {
            timeStamps.add(0);
        }
        return super.calculateAndPrint(numberOfFrames);
    }

    @Override
    void insert(int page) {
        if (!isInFrame(page)) {
            frames.set(timeStamps.indexOf(Collections.min(timeStamps)), page);
            gaps++;
        }
        timeStamps.set(frames.indexOf(page), ++time);
    }
}
