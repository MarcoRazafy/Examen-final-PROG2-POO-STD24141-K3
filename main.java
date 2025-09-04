import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


public class main{
    public static void main(String[] args) {
        Frais frais = new Frais(1, "Frais de scolarité", 5000000, Instant.parse("2025-09-30T23:59:59Z"));

        List<Paiement> paiements = new ArrayList<>();
        paiements.add(new Paiement(1, 200000, Instant.parse("2025-09-15T10:00:00Z")));
        paiements.add(new Paiement(2, 150000, Instant.parse("2025-10-01T10:00:00Z")));
        paiements.add(new Paiement(3, 150000, Instant.parse("2025-10-05T10:00:00Z")));

        Instant instant = Instant.parse("2025-09-30T12:00:00Z");

        String statut = statutFrais(frais, paiements, instant);
        System.out.println("Statut du frais au " + instant + ": " + statut);
    }

    public static String statutFrais(Frais frais, List<Paiement> paiements, Instant instant) {
        double totalPayé = 0;
        for (Paiement p : paiements) {
            if (!p.getDate().isAfter(instant)) {
                totalPayé += p.getMontant();
            }
        }
        if (totalPayé >= frais.getMontant()) {
            return "Payé";
        } else if (instant.isAfter(frais.getDeadLine())) {
            return "En retard";
        } else {
            return "En cours";
        }

    }


}
