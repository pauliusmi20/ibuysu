import java.util.ArrayList;
import java.util.List;
// import com.modeliosoft.modelio.javadesigner.annotations.objid;

// @objid ("3b1c7878-0e73-473b-9a63-5133f7330caa")
public class Categorie {
    // @objid ("322cea7d-e3b7-454d-88e9-d570617efdb4")
    private String nom;

    // @objid ("94fb7b5f-f762-468b-b468-dc2b6e139639")
    public List<Item> item = new ArrayList<Item> ();

    // @objid ("a0582cba-b84d-42a3-8062-f808cf2a5e18")
    public Systeme sys; // pourquoi on a systeme dans categorie?

    // @objid ("74358f1a-0ada-495d-8eee-d528f71a4dd4")
    public Categorie() {
    }

}
