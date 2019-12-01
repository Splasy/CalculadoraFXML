package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;

public class CalculadoraController implements Initializable {
	
	calculadora calculadora;
	
	@FXML
    private GridPane root;

    @FXML
    private Button button_siete;

    @FXML
    private TextField texto;

    @FXML
    private Button button_cuatro;

    @FXML
    private Button button_uno;

    @FXML
    private Button button_cero;

    @FXML
    private Button button_dos;

    @FXML
    private Button button_cinco;

    @FXML
    private Button button_ocho;

    @FXML
    private Button button_nueve;

    @FXML
    private Button button_seis;

    @FXML
    private Button button_tres;

    @FXML
    private Button button_coma;

    @FXML
    private Button button_igual;

    @FXML
    private Button button_suma;

    @FXML
    private Button button_resta;

    @FXML
    private Button button_borrarTodo;

    @FXML
    private Button button_multiplicacion;

    @FXML
    private Button button_division;

    @FXML
    private Button button_borrar;
    
    @FXML
    void onBorrarAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.borrar();
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onBorrarTodoAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.borrarTodo();
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onCeroAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('0');
    	
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onCincoAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('5');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('4');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onDividirAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.operar('/');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onDosAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('2');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onIgualAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.operar('=');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onMasAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.operar('+');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.operar('*');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onNueveAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('9');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onOchoAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('8');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onPuntoAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertarComa();
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onRestarAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.operar('-');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onSeisAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('6');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onSieteAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('7');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onTresAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('3');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }

    @FXML
    void onUnoAction(ActionEvent event) {
    	dad.javafx.calculadora.calculadora.insertar('1');
    	texto.setText(dad.javafx.calculadora.calculadora.getPantalla());
    }
    
	public CalculadoraController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/calculadoraFXML.fxml"));
		loader.setController(this);
		loader.load();
		
		calculadora= new calculadora();
	}
	
	public VBox getView() {
		return getView();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Funca");
	}

}
