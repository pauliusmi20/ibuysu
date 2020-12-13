import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("313a17cb-13cc-4f73-aa03-66fd1532d97e")
public class VenteAuxEncheres extends Vente {
    // @objid ("0d96041d-647c-4ddd-8f0b-1c59809738c6")
    private double prixBase;

    // @objid ("150d3eb6-b858-4015-bd51-0ae3df836ccd")
    private Date datedefin;

    // @objid ("ee3aea0e-2f7d-4336-a83d-e87a771abfe8")
    private Date dateDebut;

    // @objid ("3bdbe34f-4820-46d8-9a96-4b4bdc25f8b1")
    public List<Enchere> enchere = new ArrayList<Enchere> ();

    // @objid ("8a43b12e-1abd-4989-8d55-cf047daabef1")
    public void misAJourVenteEnchere() {
    }

    // @objid ("e5b7c00e-33d7-470a-b6e7-63b96b1dff08")
    public void finVente() {
    }

    // @objid ("d6ca400d-cef5-4185-9b00-59c218002ad0")
    public VenteAuxEncheres(int etat, Date publication, Item item, Vendeur vendeur, double prixBase, Date datedefin, Date dateDebut) {
        super(etat, publication, item, vendeur);
        this.prixBase = prixBase;
        this.datedefin = datedefin;
        this.dateDebut = dateDebut;
    }

}
