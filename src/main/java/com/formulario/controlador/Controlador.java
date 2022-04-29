package com.formulario.controlador;

import com.formulario.modelo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    Usuario usu = new Usuario();
    List<Usuario> usuarios = new ArrayList<>();


    @FXML
    private TextField txNom;
    @FXML
    private Button borrar;
    @FXML
    private Button enviar;
    @FXML
    private TextField txPasswd;

    @FXML
    private TextField txApe;
    @FXML
    private TextField txId;
    @FXML
    private TextField txFecha;
    @FXML
    private Button mostrar;
    @FXML
    private TextArea panel;

    @FXML
    public void onMostrar(ActionEvent actionEvent) {
        for (Usuario p :
                usuarios) {
            panel.setText(p);
        }
    }

    @FXML
    public void onBorrar(ActionEvent actionEvent) {
        panel.setText("");
        txFecha.setText("");
        txPasswd.setText("");
        txApe.setText("");
        txNom.setText("");
        txId.setText("");
    }

    @FXML
    public void onEnviar(ActionEvent actionEvent) {
        obtenerInfo();
    }

    public void obtenerInfo() {
        String id = txId.getText();
        String nombre = txNom.getText();
        String apellido = txApe.getText();
        String fecha = txId.getText();
        String contrasenia = txPasswd.getText();

        usuarios.add(new Usuario(id,nombre,apellido,fecha,contrasenia));
    }


}