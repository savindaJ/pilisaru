package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PileInterfaceController {
    public Button btnSu01;

    public void btnsu01OnAction(ActionEvent actionEvent) throws IOException {
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(getClass().getResource("../sensors/sensorsPopUp.fxml"))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.setTitle("pile id : su01");
        satge.show();
        //btnSu01.setDisable(true);
    }
}
