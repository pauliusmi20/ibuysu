import java.util.Date;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("1701bb39-3b90-4e0c-8db4-73ea5cd91aad")
public class Enchere {
    // @objid ("7a3c96d9-cb43-48a3-8df9-e2a81ebebec9")
    private double enchere;

    // @objid ("f80e03e1-3ba6-48e0-bc71-6acfe0abb5b0")
    private Date date;

    // @objid ("933dd3d9-0ba3-47d0-bd94-db4801bbd809")
    private int etat;

    // @objid ("7300f256-6e07-4d6b-af10-2adf696de9a8")
    public VenteAuxEncheres venteAuxEncheres;

    // @objid ("061cfd36-5460-4a9c-b886-846810578ad3")
    public Enchere(double enchere, Date date, int etat, VenteAuxEncheres venteAuxEncheres) {
        this.enchere = enchere;
        this.date = date;
        this.etat = etat;
        this.venteAuxEncheres = venteAuxEncheres;
    }

    // @objid ("d2ed0b53-594d-4fea-89be-0da3465ad3cd")
    double getEnchere() {
        return this.enchere;
    }

    // @objid ("bfa68620-85d0-45c9-a24e-65e45fbb3a23")
    void setEnchere(double value) {
        this.enchere = value;
    }

}
