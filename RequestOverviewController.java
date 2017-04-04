package sample;

import com.sun.deploy.nativesandbox.comm.Request;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.Main;


/**
 * Created by 17YTariq on 04/04/2017.
 */
public class RequestOverviewController  {

    @FXML
    private TableView<sample.Request> personTable;
    @FXML
   private TableColumn<sample.Request, String> nameColumn;
    @FXML
    private TableColumn<sample.Request, String> emailAddressColumn;
    @FXML
    private TableColumn<sample.Request, Integer> phoneNumberColumn;
    @FXML
    private TableColumn<sample.Request, String> departmentColumn;
    @FXML
    private TableColumn<sample.Request, String> activityTitleColumn;
    @FXML
    private TableColumn<sample.Request, String> activityTypeColumn;
    @FXML
    private TableColumn<sample.Request, String> eventObjectiveColumn;
    @FXML
    private TableColumn<sample.Request, String> eventSynopsisColumn;
    @FXML
    private TableColumn<sample.Request, String> numberOfAttendeesColumn;
    @FXML
    private TableColumn<sample.Request, String> specialRequestsColumn;
    @FXML
    private TableColumn<sample.Request, String> startTimeColumn;
    @FXML
    private TableColumn<sample.Request, String> endTimeColumn;
    @FXML
    private TableColumn<sample.Request, String> dateOfEventColumn;
 @FXML
 private Label nameLabel;

 @FXML
 private Label phoneNumberLabel;

 @FXML
 private Label emailAddressLabel;

 @FXML
 private Label departmentLabel;

 @FXML
 private Label activityTitleLabel;

 @FXML
 private Label activityTypeLabel;

 @FXML
 private Label eventObjectiveLabel;

 @FXML
 private Label eventSynopsisLabel;

 @FXML
 private Label numberOfAttendeesLabel;

 @FXML
 private Label specialRequestsLabel;

 @FXML
 private Label startTimeLabel;

 @FXML
 private Label endTimeLabel;

 @FXML
 private Label dateOfEventLabel;



 // Reference to the main application.
    private Main main;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public RequestOverviewController() {
    }
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the 13 columns.
     nameColumn.setCellValueFactory(cellData -> cellData.getValue().fullNameProperty());
     emailAddressColumn.setCellValueFactory(cellData -> cellData.getValue().emailAddressProperty());
     phoneNumberColumn.setCellValueFactory(cellData -> cellData.getValue().phoneNumberProperty().asObject());
     departmentColumn.setCellValueFactory(cellData -> cellData.getValue().departmentProperty());
     activityTitleColumn.setCellValueFactory(cellData -> cellData.getValue().activityTitleProperty());
     activityTypeColumn.setCellValueFactory(cellData -> cellData.getValue().activityTitleProperty());
     eventObjectiveColumn.setCellValueFactory(cellData -> cellData.getValue().eventObjectiveProperty());
     eventSynopsisColumn.setCellValueFactory(cellData -> cellData.getValue().eventSynopsisProperty());
     numberOfAttendeesColumn.setCellValueFactory(cellData -> cellData.getValue().expectedNumberOfAttendeesProperty().asString());
     specialRequestsColumn.setCellValueFactory(cellData -> cellData.getValue().specialRequestsProperty());
     startTimeColumn.setCellValueFactory(cellData -> cellData.getValue().startTimeProperty());
     endTimeColumn.setCellValueFactory(cellData -> cellData.getValue().endTimeProperty());
     dateOfEventColumn.setCellValueFactory(cellData -> cellData.getValue().datePickerProperty());

     showRequestDetails(null);

     personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showRequestDetails(newValue));
    }



 /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param main
     */
    public void setMain(Main main) {
     this.main = main;

     // Add observable list data to the table
     personTable.setItems(main.getRequestData());
    }

    private void showRequestDetails(sample.Request request){
     if(request!=null) {
      nameLabel.setText(request.getFullName());
      phoneNumberLabel.setText(String.valueOf(request.getPhoneNumber()));
      emailAddressLabel.setText(request.getEmailAddress());
      departmentLabel.setText(request.getDepartment());
      activityTitleLabel.setText(request.getActivityTitle());
      activityTypeLabel.setText(request.getActivityType());
      eventObjectiveLabel.setText(request.getEventObjective());
      eventSynopsisLabel.setText(request.getEventSynopsis());
      numberOfAttendeesLabel.setText(String.valueOf(request.getExpectedNumberOfAttendees()));
      startTimeLabel.setText(request.getStartTime());
      endTimeLabel.setText(request.getEndTime());
      dateOfEventLabel.setText(request.getDatePicker());
     }else{
      //Request is null, remove all text
      nameLabel.setText("");
      phoneNumberLabel.setText("");
      emailAddressLabel.setText("");
      departmentLabel.setText("");
      activityTitleLabel.setText("");
      activityTitleLabel.setText("");
      eventObjectiveLabel.setText("");
      eventSynopsisLabel.setText("");
      numberOfAttendeesLabel.setText("");
      startTimeLabel.setText("");
      endTimeLabel.setText("");
      dateOfEventLabel.setText("");
     }
    }

    @FXML
 private void handleDeletePerson(){
     int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
     if (selectedIndex>= 0) {
      personTable.getItems().remove(selectedIndex);
     }else{
      //No user is selected
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.initOwner(main.getPrimaryStage());
      alert.setTitle("NO SELECTION IS MADE");
      alert.setHeaderText("NO PERSON IS SELECTED.");
      alert.setContentText("SELECT A PERSON BEFORE PRESSING DELETE");
      alert.showAndWait();
     }
    }
}
