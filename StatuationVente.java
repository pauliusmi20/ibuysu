import java.util.ArrayList;
import java.util.List;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("8477357c-1209-49aa-895a-9a65553d30eb")
public class StatuationVente {
    // @objid ("11080515-de7c-40c8-b62a-0a91df8976b5")
    private boolean venteValidee;

    // @objid ("927e988e-1a32-4905-851a-e03a508befb2")
    public List<Acheteur> acheteur = new ArrayList<Acheteur> ();

    // @objid ("9a3e112c-da9a-4c4b-afcc-d0fcc96ce09e")
    public Vente vente;

    // @objid ("e0fcb19e-be34-4f48-b6eb-d62e4cbddec6")
    public List<Vendeur> vendeur = new ArrayList<Vendeur> ();

    // @objid ("ad02dcb8-d312-445c-a067-59413e64afc0")
    public Evaluation evaluation;

    // @objid ("849449cd-af93-4204-a462-32212aef8ded")
    public void updateStatueVente(boolean statuationVente) {
    }

    // @objid ("b9fa5a48-1be9-4df7-a415-1f88e7cff725")
    boolean isVenteValidee() {
        return this.venteValidee;
    }

    // @objid ("79d35145-ad65-4cf3-8550-e5872da90187")
    void setVenteValidee(boolean value) {
        this.venteValidee = value;
    }

    // @objid ("f0a48781-09f8-4c78-922a-fcc6600d8fc1")
    public void statuerVente() {
    }

    // @objid ("da686b3b-ee52-4545-8978-6f4144661605")
    public StatuationVente() {
    }

}
