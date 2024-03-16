package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Launcher extends Application {
    public static void main(String[] args) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane rootNode  =FXMLLoader.load( this.getClass().getResource("/view/login-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.centerOnScreen();
        stage.show();
    }
}