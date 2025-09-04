import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class statistics{
    public static List<Frais> getLateFees(List<Frais> fraisList, Instant instant) {
        List<Frais> res = new ArrayList<>();
        for (Frais f : fraisList) {
            if (instant.isAfter(f.getDeadLine())) {
                res.add(f);
            }
        }
        return res;
    }   
    public static double getTotalMissingFees(List<Frais> fraisList, Instant instant) {
        double total = 0.0;
        for (Frais f : fraisRetard(fraisList, instant)) {
            total += f.getMontant();
        }
        return total;
    }
    public static double getTotalPaidStudent(Etudiant etudiant, List<paiements> paiements , Isntant instant) {
        double total = 0;
        for (Paiement p : paiements) {
            if (p.getDate().isBefore(instant)) {
                total += p.getMontant();
            }
            
        }
    }

}