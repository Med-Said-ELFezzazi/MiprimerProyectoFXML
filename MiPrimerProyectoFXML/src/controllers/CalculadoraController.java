package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Operaciones;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

//import model.Operaciones;

public class CalculadoraController {

    @FXML
    private Button btnCalcular;

    @FXML
    private RadioButton rbDividir;

    @FXML
    private RadioButton rbMultiplicar;

    @FXML
    private RadioButton rbRestar;

    @FXML
    private RadioButton rbSumar;

    @FXML
    private ToggleGroup tgOperacion;

    @FXML
    private TextField txtOperador1;

    @FXML
    private TextField txtOperador2;

    @FXML
    private TextField txtResultado;

    @FXML
    void calcular(ActionEvent event) {
    	  try {
              double op1 = Double.parseDouble(this.txtOperador1.getText());
              double op2 = Double.parseDouble(this.txtOperador2.getText());
              Operaciones operaciones = new Operaciones(op1, op2);
              if (this.rbSumar.isSelected()) {
                  this.txtResultado.setText(operaciones.sumar() + "");
              } else if (this.rbRestar.isSelected()) {
                  this.txtResultado.setText(operaciones.restar() + "");
              } else if (this.rbMultiplicar.isSelected()) {
                  this.txtResultado.setText(operaciones.multiplicar() + "");
              } else if (this.rbDividir.isSelected()) {
                  if (op2 == 0) {
                      Alert alert = new Alert(Alert.AlertType.ERROR);
                      alert.setHeaderText(null);
                      alert.setTitle("Error");
                      alert.setContentText("El operando 2 no puede ser 0");
                      alert.showAndWait();
                  } else {
                      this.txtResultado.setText(operaciones.dividir() + "");
                  }
              }
          } catch (NumberFormatException e) {
              Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setHeaderText(null);
              alert.setTitle("Error");
              alert.setContentText("Formato incorrecto");
              alert.showAndWait();
          }
        }
}