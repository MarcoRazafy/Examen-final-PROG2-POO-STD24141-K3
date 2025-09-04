import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String dateEntree;
    public Client(int id, String nom, String prenom, String date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntree = date;
    }
    }


    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return prenom + " " + nom + " " + dateEntree;
    }
}
