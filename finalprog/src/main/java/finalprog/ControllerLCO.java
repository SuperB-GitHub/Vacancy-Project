package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Window;

public class ControllerLCO {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddVacan;

    @FXML
    private Button ButtonTrueVacancy;

    @FXML
    private Button CloseLaunch;

    @FXML
    private Label LabelComp;

    @FXML
    private Label LabelFIO;

    @FXML
    private Button NJobs;

    @FXML
    private Button Offers;

    @FXML
    void butAddVacan(ActionEvent event) throws IOException {
        App.setRoot("LCV");
    }

    @FXML
    void butNjobs(ActionEvent event) {

    }

    @FXML
    void butOffers(ActionEvent event) {

    }

    @FXML
    void clslaunch(ActionEvent event) {
        Window window = CloseLaunch.getScene().getWindow();
        window.hide();
    }

    @FXML
    void initialize() {

    }

}
