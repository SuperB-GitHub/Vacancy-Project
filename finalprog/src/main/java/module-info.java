module finalprog {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;

    opens finalprog to javafx.fxml;
    exports finalprog;
}
