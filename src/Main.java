/**
 * @author Wojciech Okoński
 *         created on 02.05.2016 r.
 */
public class Main {
    public static void main(String[] args) {
        PageSequenceGenerator psg = new PageSequenceGenerator(1000, 7);
        System.out.println("Sequence: " + psg.getSequence());

        FIFO fifo = new FIFO(psg.getSequence());

        System.out.println();
        fifo.calculateAndPrint(3);
        fifo.calculateAndPrint(4);
        fifo.calculateAndPrint(5);

        LRU lru = new LRU(psg.getSequence());

        System.out.println();
        lru.calculateAndPrint(3);
        lru.calculateAndPrint(4);
        lru.calculateAndPrint(5);

        Optimal optimal = new Optimal(psg.getSequence());

        System.out.println();
        optimal.calculateAndPrint(3);
        optimal.calculateAndPrint(4);
        optimal.calculateAndPrint(5);
    }
}
