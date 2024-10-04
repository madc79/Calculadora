package dad.calculadorafx;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
    private VBox pantallaVBox;

    @FXML
    private Button puntoButton;

    @FXML
    private TextField resultadoText;

    @FXML
    private HBox resultdoHBox;

    @FXML
    private Button seisButton;

    @FXML
    private Button sieteButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button unoButton;

    @FXML
    void onCAction(ActionEvent event) {

    }

    @FXML
    void onCEAction(ActionEvent event) {

    }

    @FXML
    void onCeroAction(ActionEvent event) {

    }

    @FXML
    void onCincoAction(ActionEvent event) {

    }

    @FXML
    void onCuatroAction(ActionEvent event) {

    }

    @FXML
    void onDividirAction(ActionEvent event) {

    }

    @FXML
    void onDosAction(ActionEvent event) {

    }

    @FXML
    void onIgualAction(ActionEvent event) {

    }

    @FXML
    void onMasAction(ActionEvent event) {

    }

    @FXML
    void onMenosAction(ActionEvent event) {

    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {

    }

    @FXML
    void onNueveAction(ActionEvent event) {

    }

    @FXML
    void onOchoAction(ActionEvent event) {

    }

    @FXML
    void onPuntoAction(ActionEvent event) {

    }

    @FXML
    void onSeisAction(ActionEvent event) {

    }

    @FXML
    void onSieteAction(ActionEvent event) {

    }

    @FXML
    void onTresAction(ActionEvent event) {

    }

    @FXML
    void onUnoAction(ActionEvent event) {

    }


}
