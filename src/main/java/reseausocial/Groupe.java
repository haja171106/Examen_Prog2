package reseausocial;

import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private List<Utilisateur> membres;
    private List<Publication> publications;
    private Administrateur admin;

    public Groupe(List<Utilisateur> membres, List<Publication> publications, Administrateur admin) {
        this.membres = membres;
        this.publications = publications;
        this.admin = admin;
    }

    public List<Utilisateur> getMembres() {
        return membres;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void ajouterMembre(Utilisateur u) {
        membres.add(u);
    }

    public void creerPublication(String contenu, Utilisateur auteur) {
        publications.add(new Publication(contenu, auteur));
    }

    public void supprimerPublication(Publication p, Utilisateur supprimeur) {
        if (supprimeur.peutSupprimerPublication()) {
            publications.remove(p);
        }
    }

    public void supprimerUtilisateur(Utilisateur cible, Utilisateur supprimeur) {
        if (supprimeur.peutSupprimerUtilisateur()) {
            membres.remove(cible);
        }
    }

    public List<Publication> chercherPublicationParMotCle(String motcle) {
        String mot = motcle.toLowerCase();
        return publications.stream()
                .filter(p -> p.getContenu().toLowerCase().contains(mot))
                .collect(Collectors.toList());
    }

    public boolean verifierPresenceUtilisateur(Utilisateur utilisateur) {
        return membres.contains(utilisateur);
    }

    public int getNombrePublications() {
        return publications.size();
    }
}
