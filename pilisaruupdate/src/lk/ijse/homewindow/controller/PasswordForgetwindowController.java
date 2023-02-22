package lk.ijse.homewindow.controller;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PasswordForgetwindowController{

    public Label lblSetName;
    public Hyperlink hyperlinkText;
    String name;

    public void setName(String name){
        this.name=name;
        System.out.println(this.name);
    }
    public void openLink() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=compost+bin+sri+" +
                "lanka&oq=compost&aqs=chrome.6.69i59j69i57j0i67l2j0i512l6.14786j0j15&sourceid=chrome&ie=UTF-8"));

    }
}
