import java.util.Date;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("46b1f45f-6d87-4c08-b3d4-b811f4248a8f")
public abstract class Vente {
    // @objid ("c1ce0469-340d-4f28-b2d5-7b9e6098fad3")
    private int etat;

    // @objid ("9c8b9054-17b4-46d0-8b71-d75c543dd4d9")
    private Date publication;

    // @objid ("f8947f8e-f7c4-4918-8d54-3c5ebdd625af")
    public Item item;

    // @objid ("39a4f495-6735-4236-aacd-3d828ea0758e")
    public Vendeur vendeur;

    public Vente(int etat, Date publication, Item item, Vendeur vendeur) {
        this.etat = etat;
        this.publication = publication;
        this.item = item;
        this.vendeur = vendeur;
    }
}
