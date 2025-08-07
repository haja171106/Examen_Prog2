package reseausocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String contenu;
    private Utilisateur auteur;
    private LocalDateTime date;
    private List<Commentaire> commentaires;

    public Publication(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
        this.date = LocalDateTime.now();
        this.commentaires = new ArrayList<>();
    }

    public void ajouterCommentaire(Commentaire c) {
        commentaires.add(c);
    }

    public String getContenu() {
        return contenu;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
