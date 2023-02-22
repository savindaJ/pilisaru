package lk.ijse.homewindow.controller.sensorsController;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;

public class SensorPanal2Controller {

    SensorsPopUpContriller sensorsPopUpContriller;

    @FXML
    private Label lblTemp;

    @FXML
    private Slider tempSlider;

    @FXML
    void initialize() {
        assert lblTemp != null : "fx:id=\"lblTemp\" was not injected: check your FXML file 'sensorPanal2.fxml'.";
        assert tempSlider != null : "fx:id=\"tempSlider\" was not injected: check your FXML file 'sensorPanal2.fxml'.";

        tempSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                sensorsPopUpContriller=new SensorsPopUpContriller();
                int result= (int) tempSlider.getValue();
                lblTemp.setText(result+"C");
                sensorsPopUpContriller.setLblWater(result);
//                sensorsPopUpContriller.lblTemp.setText(result+" C");
            }
        });
    }
}
