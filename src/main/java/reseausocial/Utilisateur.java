package reseausocial;

import java.time.LocalDate;

public class Utilisateur {
    private String identifiant;
    private String nomUtilisateur;
    private String email;
    private LocalDate dateCreation;

    public Utilisateur(String identifiant, String nomUtilisateur, String email) {
        this.identifiant = identifiant;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public boolean peutSupprimerPublication() {
        return false;
    }

    public boolean peutSupprimerUtilisateur() {
        return false;
    }

}
