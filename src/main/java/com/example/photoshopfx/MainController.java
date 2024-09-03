package com.example.photoshopfx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public ImageView imgView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onAbrir(ActionEvent actionEvent) {
        FileChooser fileChooser;
        fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("c://"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Todas imagens","*.jpeg", "*.png", "*.bmp", "*.webp", "*.jpg")
                ,new FileChooser.ExtensionFilter("JPEG", "*.jpg")
                ,new FileChooser.ExtensionFilter("PNG", "*.png")
                ,new FileChooser.ExtensionFilter("BMP", "*.bmp")
        );
        File file = fileChooser.showOpenDialog(null);
        if(file!=null) {
            Image img;
            img = new Image(file.toURI().toString());
            imgView.setImage(img);
            imgView.setFitWidth(img.getWidth());
            imgView.setFitHeight(img.getHeight());
        }
    }

    public void onSalvar(ActionEvent actionEvent) {
    }

    public void onSalvarComo(ActionEvent actionEvent) {
    }

    public void onSair(ActionEvent actionEvent) {
        Platform.exit();
    }
}