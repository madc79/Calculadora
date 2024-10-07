package dad.calculadorafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        CalculadoraController calculadoraController = new CalculadoraController();

        Stage calculadoraStage = new Stage();
        calculadoraStage.setTitle("Calculadora");
        calculadoraStage.setScene(new Scene(calculadoraController.getRoot()));
        calculadoraStage.show();

    }
}
