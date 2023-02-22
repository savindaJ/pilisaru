package lk.ijse.homewindow.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class StartWindowCcontroller {
    public Button btnSingIn;
    public AnchorPane mainframethisWindow;
    public PasswordField passwordField;
    public Label lblWarning;
    int chance=0;

    public void btnSingInOnAction() throws IOException {

        ++chance;

        String check=passwordField.getText();
        int number = Integer.parseInt(check);
        passwordField.setText("");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interface/homeWindow.fxml"));
        Pane registerPane = fxmlLoader.load();

        int password = 2002;

        if(password == number ){
            try {
                mainframethisWindow.getChildren().clear();
                mainframethisWindow.getChildren().setAll(registerPane);
                System.gc();
            } catch (Exception e) {
                System.out.println("incorrect Password");
                e.printStackTrace();
            }
        }else{
            lblWarning.setText("incorrect Password");
            lblWarning.setVisible(true);
        }
        if(3<=chance){
            System.exit(0);
        }
    }

    public void passFieldOnAction() { }

    public void passOnActionKeyTyped() {
        String pass=passwordField.getText();
        try{
            int number = Integer.parseInt(pass);
            lblWarning.setVisible(false);
        }catch (Exception e){
            lblWarning.setVisible(true);
        }
        if(pass.equals("")){
            lblWarning.setVisible(false);
        }

    }
}
