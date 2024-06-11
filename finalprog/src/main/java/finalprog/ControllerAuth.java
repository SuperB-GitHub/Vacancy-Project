package finalprog;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class ControllerAuth {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonAuth;

    @FXML
    private Button ButtonExit;

    @FXML
    private TextField FieldMail;

    @FXML
    private Label LabelError;

    @FXML
    private PasswordField GetPassword;

    @FXML
    void butAuth(ActionEvent event) throws IOException, SQLException {
        DatabaseHandler dbh = new DatabaseHandler();
        String login = FieldMail.getText().trim();
        String pass = GetPassword.getText().trim();
            if (!login.equals("") && !pass.equals("")){
                    ResultSet result = dbh.login(login, pass);
                    String who = result.getString("Who");
                    int count = 0;
                    while (result.next()) {
                        count++;
                    }
                    if (count==1) {
                        if (who.equals("Admin")) {
                            LabelError.setVisible(true);
                            Window window = ButtonAuth.getScene().getWindow();
                            window.hide();
                        } 
                        else if (who.equals("Company")) {
                            LabelError.setVisible(true);
                            Window window = ButtonAuth.getScene().getWindow();
                            window.hide();
                            App.setRoot("LCV");
                        }
                        else if (who.equals("NotJob")) {
                            Window window = ButtonAuth.getScene().getWindow();
                            window.hide();
                            App.setRoot("LNWP");
                        }
                    } else {
                        LabelError.setVisible(true);
                    }
                }
            else {
                LabelError.setVisible(true);
            }
    }

    @FXML
    void fieldMail(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void butExit(ActionEvent event) {
        Window window = ButtonAuth.getScene().getWindow();
        window.hide();
    }

    @FXML
    void initialize() {

    }

}
