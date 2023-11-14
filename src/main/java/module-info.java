module com.example.ratatouille {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ratatouille to javafx.fxml;
    exports com.example.ratatouille;
}