// test unitaire
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Instant futureDeadline = Instant.now().plusSeconds(3600); 
        Frais frais = new Frais(1, "Frais de scolarité", 1000000, futureDeadline);

        List<Paiement> paiements = new ArrayList<>();
        paiements.add(new Paiement(1, 300000, Instant.now().minusSeconds(7200))); 
        paiements.add(new Paiement(2, 400000, Instant.now().minusSeconds(1800))); 

        String statutAvantDeadline = main.statutFrais(frais, paiements, Instant.now());
        System.out.println("Statut avant la deadline: " + statutAvantDeadline);

        paiements.add(new Paiement(3, 300000, Instant.now().minusSeconds(600)));

        String statutApresPaiement = main.statutFrais(frais, paiements, Instant.now());
        System.out.println("Statut après avoir atteint le montant total: " + statutApresPaiement);

        String statutApresDeadline = main.statutFrais(frais, paiements, futureDeadline.plusSeconds(1));
        System.out.println("Statut après la deadline sans paiement supplémentaire: " + statutApresDeadline);
    }
}