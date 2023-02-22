package lk.ijse.homewindow.controller.sensorsController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SensorsPopUpContriller {
    public Button btnsensorPanel;
    private Label lblWater;
    public Label lblTemp=new Label();
    protected int result;
    private String passedValue;

    public void btnsensorPanelOnAction() throws IOException {
        //lblWater.setText("worked");
        Stage satge=new Stage();
        satge.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../../sensors/sensorPanal2.fxml")))));
        satge.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge.show();
        btnsensorPanel.setDisable(true);
    }
    public void setLblWater(int result){
        this.result=result;
        lblTemp.setText(String.valueOf(result));
        System.out.println(result);
    }


    @FXML
    void initialize() {
        assert btnsensorPanel != null : "fx:id=\"btnsensorPanel\" was not injected: check your FXML file 'sensorsPopUp.fxml'.";
        assert lblTemp != null : "fx:id=\"lblTemp\" was not injected: check your FXML file 'sensorsPopUp.fxml'.";
        assert lblWater != null : "fx:id=\"lblWater\" was not injected: check your FXML file 'sensorsPopUp.fxml'.";
        //lblTemp.setText(result+"");

    }
}
