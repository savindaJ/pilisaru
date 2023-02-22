package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ErrorFormController {

    public Hyperlink hyperBack;

    public void hyperBackOnAction() throws IOException {
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../interface/login/LoginForm.fxml")))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.setTitle("Pilisaru Management System");
        satge.show();
        Stage stage2= (Stage) hyperBack.getScene().getWindow();
        stage2.close();

    }
}
