package reseausocial;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest {

    @Test
    public void testCreationPublication() {
        Standard user = new Standard("id1", "haja", "haja@gmail.com");
        Groupe groupe = new Groupe(new ArrayList<>(), new ArrayList<>(), new Administrateur("admin1", "admin", "admin@mail.com"));
        groupe.creerPublication("hello haja ! ", user);
        assertEquals(1, groupe.getNombrePublications());
    }

    @Test
    public void testAjoutCommentaire() {
        Standard user = new Standard("id2", "aina", "aina@mail.com");
        Publication pub = new Publication("Hello aina", user);
        pub.ajouterCommentaire(new Commentaire("hello"));
        assertEquals(1, pub.getCommentaires().size());
    }
}