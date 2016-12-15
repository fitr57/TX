
/**
 *
 * @author e.carabbio
 */
public class Valore_tasse {

    public static final int SINGLE = 1;
    public static final int SPOSATO = 2;

    private static final double FASCIA1 = 0.10;
    private static final double FASCIA2 = 0.25;
    private static final double FASCIA1_SINGLE = 32000;
    private static final double FASCIA2_SPOSTATO = 64000;

    private double ammontare;
    private double stato;

    /**
     * costruttore
     */
    public Valore_tasse(double aammontare, double sstato) {
        ammontare = aammontare;
        stato = sstato;
    }

    /**
     * metodo
     */
    public double getTax() {
        double tax1 = 0;
        double tax2 = 0;

        if (stato == SINGLE) {
            if (ammontare < FASCIA1_SINGLE) {
                tax1 = FASCIA1 * ammontare;
            } else {
                tax1 = FASCIA1 * FASCIA1_SINGLE;
                tax2 = FASCIA2 * (ammontare - FASCIA1_SINGLE);
            }
        } else {
            if (ammontare < FASCIA2_SPOSTATO) {
                tax1 = FASCIA1 * ammontare;
            } else {
                tax1 = FASCIA1 * FASCIA2_SPOSTATO;
                tax2 = FASCIA2 * (ammontare - FASCIA2_SPOSTATO);
            }
        }
        return tax1 + tax2;
    }
}
