package reseausocial;

import java.time.LocalDate;

public class Commentaire {
    private String contenu;
    private LocalDate date;

    public Commentaire(String contenu) {
        this.contenu = contenu;
        this.date = date;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDate getDate() {
        return date;
    }
}
