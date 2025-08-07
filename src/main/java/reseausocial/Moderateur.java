package reseausocial;

public class Moderateur extends Utilisateur {
    public Moderateur(String identifiant, String nomUtilisateur, String email) {
        super(identifiant, nomUtilisateur, email);
    }

    @Override
    public boolean peutSupprimerPublication() {
        return true;
    }
}
