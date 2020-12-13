// import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.Date;

// @objid ("faa4d6d2-808b-4ca6-aff6-5dff289c91ae")
public class Vendeur extends Utilisateur {
    // @objid ("648ec2d1-97d0-44ca-93fe-768410cb8efd")
    private String coordoneesBanquaires;

    // @objid ("e27e0d0f-0a91-4c54-a5f3-222ed0cd2208")
    public void evaluer() {
    }

    // @objid ("a2c6420c-e507-45bb-b893-af1fe022e4d2")
    public Vendeur(String pseudo, String mail, Date dateInscription, String nom, String prenom, String motDePasse) {
        super(pseudo, mail, dateInscription, nom, prenom, motDePasse);
    }

}
