package lk.ijse.homewindow.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HomeWindowController{

    public AnchorPane maninPane;
    public Button inventory;
    public Button btnPile;
    public Button btnHome;
    public ComboBox<Object> comboEmployee;
    public Pane cmbPaneID;

    public void btnInventoryOnAction() {

    }
    public void btnPileOnAction() throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/employe/addEmployee.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            maninPane.getChildren().clear();
            maninPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void btnHomeOnAction () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/homePage/homeForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            maninPane.getChildren().clear();
            maninPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnUpdateOnAction() {
        System.out.println("clicked");
    }

    public void comboEmployeeOnAction() {

    }


    public void btnEmployeeOnMouseEnter() {
        ObservableList<Object> obList = FXCollections.observableArrayList();
        obList.add("Add");
        obList.add("Delete");
        obList.add("Update");
        obList.add("Employee");

        comboEmployee.setItems(obList);
    }

    public void initialize(){
        //cmbPaneID.setVisible(false);
    }

    public void EmployeeOnMouseExit(MouseEvent mouseEvent) {
        cmbPaneID.setVisible(false);
    }
}
