import java.util.List;

/**
 * @author Wojciech Okoński
 *         created on 02.05.2016 r.
 */
class FIFO extends Algorithm {
    private int currentFrame = 0;

    FIFO(List<Integer> sequence) {
        super(sequence);
    }

    @Override
    void insert(int page) {
        if(!isInFrame(page)) {
            frames.set(currentFrame, page);
            gaps++;
            currentFrame++;
            currentFrame %= frames.size();
        }
    }
}
