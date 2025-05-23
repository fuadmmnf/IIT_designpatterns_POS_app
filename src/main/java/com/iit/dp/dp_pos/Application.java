package com.iit.dp.dp_pos;

import com.iit.dp.dp_pos.controller.HomeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                Application.class.getResource("hello-view.fxml"));
        // Get the controller instance
        HomeController homeController = new HomeController();
        homeController.setStage(stage);
        fxmlLoader.setController(homeController);

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Sample Supershop POS Application!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}