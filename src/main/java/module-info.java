module com.formulario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.formulario to javafx.fxml;
    exports com.formulario;
    exports com.formulario.controlador;
    opens com.formulario.controlador to javafx.fxml;
}