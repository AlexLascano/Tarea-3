package com.example.navegacionforumulariosfx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CajeroController {

    @FXML private ComboBox<String> cmbProvincia;


    @FXML
    public void initialize(){
        cmbProvincia.getItems().addAll(
                "Pichincha",
                "Guayas",
                "Azuay",
                "Manabí",
                "Loja",
                "Tungurahua"
        );
    }
}
