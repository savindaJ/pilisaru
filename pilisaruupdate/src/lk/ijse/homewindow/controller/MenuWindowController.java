package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MenuWindowController {
    public AnchorPane mainAncorPane;// main ancorpane
    public Button btnHome;
    public Button btnPile;
    public Button btnCompost;
    public Button btnInventory;
    public AnchorPane helthAncorPane;
    public Button btnSingOut;
    public MenuButton btnMenuHealth;// menuButton
    public MenuItem btnGetinfo;
    public MenuItem btnHelthUpdate;
    public MenuItem btnSalaryUpdate;
    public MenuItem btnSalaryGetInfo;
    public MenuItem btnVehicalAdd;
    public MenuItem btnVehicalAdd1;
    public MenuItem btnVehicalUpdate;
    public MenuItem btnEmployeeUpdate;
    public MenuItem btnEmployeeAdd;
    public MenuItem btnEmployeeGetInfo;
    public MenuItem btnselesGetInfo;
    public MenuItem btnselesAddDetail;

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/homePage/homeForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnPileOnAction(ActionEvent actionEvent) throws IOException {// button pile
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/pile/pileinterface.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnCompostOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/menuControllerCompost/compost.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnInventoruOnAction(ActionEvent actionEvent) throws IOException {// inventory
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/inventory/maininventory.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSingOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage satge1=new Stage();
        satge1.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../interface/login/LoginForm.fxml")))));
        satge1.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        satge1.setTitle("Pilisaru Management System");
        satge1.show();
        Stage stage2 = (Stage) btnSingOut.getScene().getWindow();
        stage2.close();
    }

    public void menuHelthUpdateOnAction(ActionEvent actionEvent) throws IOException {// health
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/health/addForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void menuHelthGetInfoOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/health/employeeForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSalaryUpdateOnAction(ActionEvent actionEvent) throws IOException { //salary
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/salary/salaryUpdateForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSalaryGetInfoOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/salary/salaryForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnVehicalAddOnAction(ActionEvent actionEvent) throws IOException {// vehicle
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/vehical/addVehicle.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnVehicalUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/vehical/updateVehicle.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnVehicalGetInfoOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/vehical/vehicleInformation.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/employe/employeeDetailUpdate.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeAddOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/employe/addEmployee.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnEmployeeGetInfoOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/employe/employeeInfometion.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnselesGetInfoOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/sales/salesForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnseleseAddDetailOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/sales/addForm.fxml"));
        Pane registerPane = fxmlLoader.load();

        try {
            mainAncorPane.getChildren().clear();
            mainAncorPane.getChildren().setAll(registerPane);
            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
