import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("7307b51b-37ce-4f5a-8834-67ec8d956a89")
public class Utilisateur {
    // @objid ("72d9caf8-853f-4e9d-be03-1c7b03a43ee3")
    private String pseudo;

    // @objid ("eef45944-6375-4e95-9300-5b9a6bc28d84")
    private String mail;

    // @objid ("389f28e2-6574-48cf-9ee4-8aa28ff771ff")
    private Date dateInscription;

    // @objid ("431b708e-3078-482c-b215-562e43cd9b3c")
    private String nom;

    // @objid ("0db0aab3-8da6-41e3-9337-f4bc34856474")
    private String prenom;

    // @objid ("05562232-3c21-47ca-be21-6283392d1334")
    private String motDePasse;

    public Utilisateur(String pseudo, String mail, Date dateInscription, String nom, String prenom, String motDePasse) {
        this.pseudo = pseudo;
        this.mail = mail;
        this.dateInscription = dateInscription;
        this.nom = nom;
        this.prenom = prenom;
    }

    // @objid ("0c30dde1-334b-4117-8fd9-3706ecef54eb")
    // public List<Systeme>  = new ArrayList<Systeme> (); // pourquoi on  une liste de systeme?

    // @objid ("42035788-7a7c-4bbf-8dc1-49b0b9dc436d")
    public void SelectionnerCategorie() {
    }

    // @objid ("a0ea03e4-0c21-4609-8755-1af15ddcff21")
    public void SelectionnerArticle() {
    }

    // @objid ("53cfad7a-e850-4965-b308-7127cb18c9f4")
    public void EntrerMotCle() {
    }

}
