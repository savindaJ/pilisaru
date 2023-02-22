import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL recource=getClass().getResource("lk/ijse/homewindow/interface/login/LoginForm.fxml");
        assert recource != null;
        Parent parant= FXMLLoader.load(recource);
        Scene sense=new Scene(parant);

        primaryStage.setScene(sense);
        primaryStage.getIcons().add(new Image("lk/ijse/homewindow/assepts/20230130_225918.png"));
        primaryStage.setTitle("Pilisaru Management System");
        primaryStage.centerOnScreen();
        primaryStage.show();
        System.gc();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
