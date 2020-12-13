import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("06d17ba7-5ca1-4f87-ac52-8546d365a0fd")
public class Evaluation {
    // @objid ("8dcd6692-9919-4d28-9b75-000e1bbe193a")
    private String commentaires;

    // @objid ("546a7263-fd80-4bf2-abb3-60f173d431de")
    private Date date;

    // @objid ("baade38f-5d36-44ab-b0e0-51bc65d1ac07")
    private int note;

    // @objid ("f780f1a3-5a04-4c0d-bb56-edd9a786f1e7")
    public List<Utilisateur> utilisateur = new ArrayList<Utilisateur> ();

    // @objid ("4db410cc-02e2-4441-b72e-d3b3ef009ce4")
    // public List<Utilisateur> utilisateur = new ArrayList<Utilisateur> ();

    // @objid ("85862a57-bce5-4433-8a23-806082230b74")
    public Evaluation(String commentaires, Date date, int note, Utilisateur utilisateurEmetteur, Utilisateur utilisateurDestinataire) {
        this.commentaires = commentaires;
        this.date = date;
        this.note = note;
        utilisateur.add(utilisateurEmetteur);
        utilisateur.add(utilisateurDestinataire);
    }

}
