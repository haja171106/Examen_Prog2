package reseausocial;

public class Administrateur extends Moderateur {
    public Administrateur(String identifiant, String nomUtilisateur, String email) {
        super(identifiant, nomUtilisateur, email);
    }

    @Override
    public boolean peutSupprimerUtilisateur() {
        return true;
    }
}