import java.util.List;

/**
 * @author Wojciech Okoński
 *         created on 03.05.2016 r.
 */
class Optimal extends Algorithm {
    private int startIndex;

    Optimal(List<Integer> sequence) {
        super(sequence);
    }

    int calculateAndPrint(int numberOfFrames) {
        startIndex = 1;
        return super.calculateAndPrint(numberOfFrames);
    }

    @Override
    void insert(int page) {
        if (!isInFrame(page)) {
            frames.set(getVictim(), page);
            gaps++;
        }
        startIndex++;
    }

    private int getVictim() {
        int victim = 0, maxDistance = 1, position;
        for (int i = 0; i < frames.size(); i++) {
            position = sequence.subList(startIndex, sequence.size()).indexOf(frames.get(i));
            if (position == -1) return i;
            else if (position + startIndex > maxDistance) {
                maxDistance = position + startIndex;
                victim = i;
            }
        }
        return victim;
    }
}
