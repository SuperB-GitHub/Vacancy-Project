package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Window;

public class ControllerLCV {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AddCity;

    @FXML
    private TextField AddName;

    @FXML
    private TextField AddNameComp;

    @FXML
    private TextField AddNumPhone;

    @FXML
    private TextField AddSpec;

    @FXML
    private TextField AddVacID;

    @FXML
    private Button AddVacan;

    @FXML
    private TextField AddZP;

    @FXML
    private Button ButtonAddVacancy;

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
    private RadioButton RBFemale;

    @FXML
    private RadioButton RBMale;

    @FXML
    private RadioButton RBNone;

    @FXML
    private ToggleGroup gender;

    @FXML
    void butAddVacan(ActionEvent event) {

    }

    @FXML
    void butNjobs(ActionEvent event) {

    }

    @FXML
    void butOffers(ActionEvent event) throws IOException {
        App.setRoot("LCO");

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
