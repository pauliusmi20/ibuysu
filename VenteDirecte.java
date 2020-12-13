import java.util.ArrayList;
import java.util.List;
import java.util.Date;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("250d8a5a-0f02-482c-88a7-92a8b49b6684")
public class VenteDirecte extends Vente {
    // @objid ("66dcb98d-6471-45f9-a2e3-c4809b4eaf33")
    private int prix;

    // @objid ("771144b2-49ae-424e-9089-ed5104780800")
    // public List<Systeme>  = new ArrayList<Systeme> (); POUQUOI ON A SYSTEME DANS VENTE

    // @objid ("66c20bd2-eaa2-4109-90ae-7b17e32ccba1")
    public void CreerVenteDirecte() {
    }

    // @objid ("37bda6ac-b002-40dd-a238-8ec176f58594")
    public VenteDirecte(int etat, Date publication, Item item, Vendeur vendeur, int prix) {
        super(etat, publication, item, vendeur);
        this.prix = prix;
    }
}
