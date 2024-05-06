import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controleur{

    private Environnement env;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.env=new Environnement(300,300);

        // mettre cela pour que les acteurs ne sortent pas visuellement du panneau de jeu en bas et a sroite...
        this.panneauJeu.setMaxWidth(305); // 5== largeur de l'image ou du rectangle.
        this.panneauJeu.setMaxHeight(305);
        this.nbTour.textProperty().bind(this.env.getNbToursProperty().asString());
        MonObservateurDeTour obs = new MonObservateurDeTour(this.nbTour);
        this .env.NbToursProperty().addListener(obs);
    }
}
