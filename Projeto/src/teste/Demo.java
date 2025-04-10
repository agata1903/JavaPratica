package teste;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Demo extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button botaoIniciar = new Button("Iniciar");
        Button botaoSair = new Button("Sair");

        botaoIniciar.setOnAction(e -> System.out.println("Iniciando..."));
        botaoSair.setOnAction(e -> System.exit(0));

        HBox box = new HBox();
        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(botaoIniciar);
        box.getChildren().add(botaoSair);

        Scene cena = new Scene(box, 200, 400);

        primaryStage.setScene(cena);
        primaryStage.show();

    }
}
