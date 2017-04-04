package sample;
/**
 * Created by 17YTariq on 21/03/2017.
 */
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.LiteralNode;

import javax.swing.*;
import java.io.FileWriter;


public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;
    @FXML
    private void makeLogin(ActionEvent event) throws IOException {
        //Stage stage;
        //Parent root;
        //stage = (Stage) login.getScene().getWindow();
        //root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        String user = username.getText();
        String pass = password.getText();
        if (event.getSource() == login && user.equals("12345") && pass.equals("12345")) {
            System.out.println("Welcome Mr. T! Here is your form!");
            Stage stage = (Stage) login.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Please try again");
        }


    }}

