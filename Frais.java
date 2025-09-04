import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Frais {
    private int id; 
    private String label;
    private double montant;
    private Instant deadLine;

    public Frais(int id, String Label, double montant, Instant deadLine) {
        this.id = id;
        this.label = label;
        this.montant = montant;
        this.deadLine = deadLine;
    }

    public int getId(){
        return id; 
    }

    public String getLabel(){
        return label;
    }

    public double getMontant(){
        return montant;
    }

    public Instant getDeadLine(){
        return deadLine;
    }

    public String toString() {
        return "Frais{id=" + id + ", label=" + label + ", montant=" + montant + ", deadLine=" + deadLine + "}";
    }
}