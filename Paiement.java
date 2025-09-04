import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Paiement {
    private int id ;
    private double montant;
    private Instant date;

    public Paiement(int id, double montant, Instant date) {
        this.id = id;
        this.montant = montant;
        this.date = date;
    }

    public int getId() {
        return id;
    }
    public double getMontant() {
        return montant;
    }
    public Instant getDate() {
        return date;
    }

    
    public String toString() {
        return "Paiement [id=" + id + ", montant=" + montant + ", date=" + date + "]";
    }

}












