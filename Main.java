package sample;

import com.jfoenix.controls.JFXTreeTableView;
import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.org.apache.regexp.internal.REUtil;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main extends Application {

        private Stage primaryStage;
        private BorderPane rootLayout;

        @Override
        public void start(Stage primaryStage) {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Request App");

            initRootLayout();

            showRequestOverview();;
        }

        /**
         * Initializes the root layout.
         */
        public void initRootLayout() {
            try {
                // Load root layout from fxml file.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("RootLayout.fxml"));
                rootLayout = (BorderPane) loader.load();

                // Show the scene containing the root layout.
                Scene scene = new Scene(rootLayout);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Shows the person overview inside the root layout.
         */

        /**
         * Returns the main stage.
         * @return
         */
        public Stage getPrimaryStage() {
            return primaryStage;
        }

    /**
     * The data as an observable list of Persons.
     */
    private ObservableList<sample.Request> requestData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public Main() {
        // Add some sample data
        requestData.add(new Request("Yasin Tariq", "yasin2ktk@gmail.com",120202, "Finance", "Football", "To play football at with kids",
                "Sport event", "Playing football with kids at a sport event at school", 11, "-", "12 PM", "2 PM", "3rd of March"));
        requestData.add(new sample.Request());

               //"David Blaine","davidblaine@gmail.com
               //,12345, "Finance", "Football", "To play a game of football",
                //"Sport Match", "Football game",22, "-", "12 pm", "1 pm", "3rd of January"));
    }

    /**
     * Returns the data as an observable list of Persons.
     * @return
     */
    public ObservableList<sample.Request> getRequestData() {
        return requestData;
    }

    public void showRequestOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Screen2.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set request overview into the center of root layout.
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            sample.RequestOverviewController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //ArrayList<Request> requestList = new ArrayList<Request>();
    //final ObservableList<Request> data = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }
}







