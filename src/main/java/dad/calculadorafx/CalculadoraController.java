package dad.calculadorafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class CalculadoraController implements Initializable {

    //model

    private StringProperty pantalla = new SimpleStringProperty("");

    Calculadora calculadora = new Calculadora();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        resultadoText.textProperty().bindBidirectional(pantalla);

    }

    public CalculadoraController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Calculadora.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private GridPane botonesPane;

    @FXML
    private Button cButton;

    @FXML
    private Button ceButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button igualButton;

    @FXML
    private Button masButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button ochoButton;

    @FXML
    private VBox root;

    @FXML
    private Button puntoButton;

    @FXML
    private TextField resultadoText;

    @FXML
    private HBox resultadoHBox;

    @FXML
    private Button seisButton;

    @FXML
    private Button sieteButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button unoButton;

    @FXML
    void onCEAction(ActionEvent event) {
        calculadora.borrar();
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCAction(ActionEvent event) {
        calculadora.borrarTodo();
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCeroAction(ActionEvent event) {

        calculadora.insertar('0');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCincoAction(ActionEvent event) {
        calculadora.insertar('5');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
        calculadora.insertar('4');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onPuntoAction(ActionEvent event) {
        calculadora.insertar('.');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onDividirAction(ActionEvent event) {
        calculadora.operar('/');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onDosAction(ActionEvent event) {
        calculadora.insertar('2');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onIgualAction(ActionEvent event) {
        calculadora.operar('=');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {
        calculadora.operar('*');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onNueveAction(ActionEvent event) {
        calculadora.insertar('9');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onOchoAction(ActionEvent event) {
        calculadora.insertar('8');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onMenosAction(ActionEvent event) {
        calculadora.operar('-');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onSeisAction(ActionEvent event) {
        calculadora.insertar('6');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onSieteAction(ActionEvent event) {
        calculadora.insertar('7');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onMasAction(ActionEvent event) {
        calculadora.operar('+');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onTresAction(ActionEvent event) {
        calculadora.insertar('3');
        pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onUnoAction(ActionEvent event) {
        calculadora.insertar('1');
        pantalla.set(calculadora.getPantalla());
    }

    public final StringProperty pantallaProperty() {
        return this.pantalla;
    }

    public VBox getRoot() {
        return root;
    }

    public void setRoot(VBox root) {
        this.root = root;
    }

    public void setPantalla(StringProperty pantalla) {
        this.pantalla = pantalla;
    }

}
