import java.util.ArrayList;
import java.util.List;

/**
 * @author Wojciech Okoński
 *         created on 03.05.2016 r.
 */
abstract class Algorithm {
    protected List<Integer> sequence;
    List<Integer> frames;
    int gaps = 0;

    Algorithm(List<Integer> sequence) {
        this.sequence = sequence;
    }

    int calculateAndPrint(int numberOfFrames) {
        gaps = 0;
        frames = new ArrayList<>(numberOfFrames);
        for (int i = 0; i < numberOfFrames; i++) {
            frames.add(0);
        }

        sequence.forEach(this::insert);
        System.out.println(getClass().getSimpleName() + " with " + frames.size() + " frames: " + gaps + " gaps");
        return gaps;
    }

    abstract void insert(int page);

    boolean isInFrame(int page) {
        for (int frame : frames) {
            if (frame == page) return true;
        }
        return false;
    }
}
