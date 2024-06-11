package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class ControllerRegisterNotWork {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButForCompany;

    @FXML
    private Button ButForNotWork;

    @FXML
    private RadioButton ButMan;

    @FXML
    private RadioButton ButWoman;

    @FXML
    private Button ButtonRegister;

    @FXML
    private Button ButtonExit;

    @FXML
    private Label LabelError;

    @FXML
    private TextField FieldCity;

    @FXML
    private DatePicker FieldDate;

    @FXML
    private TextField FieldFIO;

    @FXML
    private TextField FieldMail;

    @FXML
    private TextField FieldSpec;

    @FXML
    private TextField FieldTrain;

    @FXML
    private PasswordField Password;

    @FXML
    void butForComp(ActionEvent event) throws IOException {
        ControllerStartPage.setRoot("RegisterForWork");
    }

    @FXML
    void butNotWork(ActionEvent event) throws IOException {}

    @FXML
    void butRegister(ActionEvent event) throws IOException {
        DatabaseHandler dbh = new DatabaseHandler();
        String fio = FieldFIO.getText().trim();
        String date = FieldDate.getValue().toString();
        String city = FieldCity.getText();
        String mail = FieldMail.getText().trim();
        String spec = FieldSpec.getText().trim();
        String edu = FieldTrain.getText().trim();
        String gender = "";
        if (ButMan.isSelected()) {
            gender = "Мужчина";} 
        else {gender = "Женщина";}
        String pass = Password.getText().trim();
        if(!fio.equals("") && !city.equals("") && !mail.equals("") && !date.equals("") && !spec.equals("") && !pass.equals("")){
            dbh.registerNotWork(fio, date, city, mail, spec, edu, gender, pass);
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
    void butWoman(ActionEvent event) {

    }

    @FXML
    void butMan(ActionEvent event) {

    }

    @FXML
    void fieldCity(ActionEvent event) {

    }

    @FXML
    void fieldDate(ActionEvent event) {

    }

    @FXML
    void fieldFIO(ActionEvent event) {

    }

    @FXML
    void fieldMail(ActionEvent event) {

    }

    @FXML
    void fieldSpec(ActionEvent event) {

    }

    @FXML
    void fieldTrain(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
