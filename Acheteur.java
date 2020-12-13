// import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.Date;

// @objid ("64d43cd2-4811-41fb-8c02-bedbcdcbdc09")
public class Acheteur extends Utilisateur {
    // @objid ("ad501033-4944-42de-816e-ee6a6d932531")
    public Enchere enchere; // pourquoi on a enchere dans acheteur ?

    // @objid ("2e95c861-2404-479a-8f84-4f8266dcfc11")
    public void creerAcheteur() {
    }

    // @objid ("9301a47c-648e-43a8-af36-0acbf3530c34")
    public Acheteur(String pseudo, String mail, Date dateInscription, String nom, String prenom, String motDePasse) {   
        super(pseudo, mail, dateInscription, nom, prenom, motDePasse);
    }

}
