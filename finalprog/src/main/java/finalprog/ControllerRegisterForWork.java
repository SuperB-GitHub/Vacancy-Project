package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class ControllerRegisterForWork {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButForCompany;

    @FXML
    private Button ButForNotWork;

    @FXML
    private Button ButtonRegister;

    @FXML
    private Button ButtonExit;

    @FXML
    private Label LabelError;

    @FXML
    private TextField FieldCity;

    @FXML
    private TextField FieldFIO;

    @FXML
    private TextField FieldMailComp;

    @FXML
    private TextField FieldNameComp;

    @FXML
    private TextField FieldPersMail;

    @FXML
    private PasswordField Password;

    @FXML
    void butForComp(ActionEvent event) throws IOException {}

    @FXML
    void butNotWork(ActionEvent event) throws IOException {
        ControllerStartPage.setRoot("RegisterNotWork");
    }

    @FXML
    void butRegister(ActionEvent event) throws IOException {
        DatabaseHandler dbh = new DatabaseHandler();
        String fio = FieldFIO.getText().trim();
        String city = FieldCity.getText();
        String persmail = FieldPersMail.getText().trim();
        String namecomp = FieldNameComp.getText();
        String mailcomp = FieldMailComp.getText().trim();
        String pass = Password.getText().trim();
        if(!fio.equals("") && !city.equals("") && !persmail.equals("") && !namecomp.equals("") && !mailcomp.equals("") && !pass.equals("")){
            dbh.registerForWork(fio, city, persmail, namecomp, mailcomp, pass);
            Window window = ButtonRegister.getScene().getWindow();
            window.hide();
            App.setRoot("LNWP");
        }
        else{LabelError.setVisible(true);}
    }

    @FXML
    void butExit(ActionEvent event) {
        Window window = ButtonExit.getScene().getWindow();
        window.hide();
    }

    @FXML
    void fieldCity(ActionEvent event) {

    }

    @FXML
    void fieldFIO(ActionEvent event) {

    }

    @FXML
    void fieldMailComp(ActionEvent event) {

    }

    @FXML
    void fieldNameComp(ActionEvent event) {

    }

    @FXML
    void fieldPersMail(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {
        
    }

}
