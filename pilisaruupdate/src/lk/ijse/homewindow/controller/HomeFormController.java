package lk.ijse.homewindow.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeFormController {
    public Button btnSingOut;

    public void btnSingOutOnAction() throws IOException {
        Stage satge1=new Stage();
        satge1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../interface/login/LoginForm.fxml"))));
        satge1.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge1.setTitle("Pilisaru Management System");
        satge1.show();
        Stage stage2= (Stage) btnSingOut.getScene().getWindow();
        stage2.close();

        System.out.println("Snout Clicked");

    }
}
