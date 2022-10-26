package br.org.escola.sistemaescolar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

private double x;
private double y;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/br/org/escola/sistemaescola/view/LoginView.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        
        root.setOnMousePressed((MouseEvent e)->{ 
            x = e.getSceneX();
            y = e.getSceneY();
            
        });
        
        root.setOnMouseDragged((MouseEvent e)->{
        
            stage.setX(e.getScreenX()-x);
            stage.setY(e.getScreenY()-y);
            stage.setOpacity(0.4);
        });
        
        root.setOnMouseReleased((MouseEvent e )->{
            stage.setOpacity(1);
        });
        
        stage.setScene(scene);
        stage.show();
    }

 

    public static void main(String[] args) {
        launch();
    }

}