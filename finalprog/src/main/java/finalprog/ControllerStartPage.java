package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ControllerStartPage {

    private static Scene scene;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonAuth;

    @FXML
    private Button ButtonRegister;

    @FXML
    private Button ButtonExit;

    @FXML
    void butAuth(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("Auth.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(loader.load(), 350, 675);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Exception while loading stage Auth");
        }
    }

    @FXML
    void butRegister(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(ControllerStartPage.class.getResource("RegisterForWork.fxml"));
            scene = new Scene(loader.load(), 350, 675);  
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Exception while loading stage Register");
        }
    }

    @FXML
    void butExit(ActionEvent event) {
        Window window = ButtonExit.getScene().getWindow();
        window.hide();
    }

    @FXML
    void initialize() {
    }

    static void setRoot(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ControllerStartPage.class.getResource(fxml + ".fxml"));
        scene.setRoot(fxmlLoader.load());
    }


}
