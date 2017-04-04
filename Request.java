package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;



/**
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import javafx.scene.control.Button;

/**
 * Created by 17YTariq on 24/03/2017.
 */
//Request class

public class Request {
    private StringProperty FullName;
    private StringProperty EmailAddress;
    private IntegerProperty PhoneNumber;
    private StringProperty Department;
    private StringProperty ActivityTitle;
    private StringProperty EventObjective;
    private StringProperty ActivityType;
    private StringProperty eventSynopsis;
    private IntegerProperty ExpectedNumberOfAttendees;
    private StringProperty SpecialRequests;
    private StringProperty StartTime;
    private StringProperty EndTime;
    private StringProperty datePicker;

    public Request(StringProperty fullName, StringProperty emailAddress,IntegerProperty phoneNumber, StringProperty department,
                   StringProperty activityTitle, StringProperty eventObjective, StringProperty activityType,
                   StringProperty eventSynopsis, IntegerProperty expectedNumberOfAttendees, StringProperty specialRequests,
                   StringProperty startTime, StringProperty endTime, StringProperty datePicker){

        FullName = fullName;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
        Department = department;
        ActivityTitle = activityTitle;
        EventObjective = eventObjective;
        ActivityType = activityType;
        this.eventSynopsis = eventSynopsis;
        ExpectedNumberOfAttendees = expectedNumberOfAttendees;
        SpecialRequests = specialRequests;
        StartTime = startTime;
        EndTime = endTime;
        this.datePicker = datePicker;
    }

    public Request() {

    }

    public String getFullName() {
        return FullName.get();
    }

    public StringProperty fullNameProperty() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName.set(fullName);
    }

    public String getEmailAddress() {
        return EmailAddress.get();
    }

    public StringProperty emailAddressProperty() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.EmailAddress.set(emailAddress);
    }

    public int getPhoneNumber() {
        return PhoneNumber.get();
    }

    public IntegerProperty phoneNumberProperty() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.PhoneNumber.set(phoneNumber);
    }

    public String getDepartment() {
        return Department.get();
    }

    public StringProperty departmentProperty() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department.set(department);
    }

    public String getActivityTitle() {
        return ActivityTitle.get();
    }

    public StringProperty activityTitleProperty() {
        return ActivityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.ActivityTitle.set(activityTitle);
    }

    public String getEventObjective() {
        return EventObjective.get();
    }

    public StringProperty eventObjectiveProperty() {
        return EventObjective;
    }

    public void setEventObjective(String eventObjective) {
        this.EventObjective.set(eventObjective);
    }

    public String getActivityType() {
        return ActivityType.get();
    }

    public StringProperty activityTypeProperty() {
        return ActivityType;
    }

    public void setActivityType(String activityType) {
        this.ActivityType.set(activityType);
    }

    public String getEventSynopsis() {
        return eventSynopsis.get();
    }

    public StringProperty eventSynopsisProperty() {
        return eventSynopsis;
    }

    public void setEventSynopsis(String eventSynopsis) {
        this.eventSynopsis.set(eventSynopsis);
    }

    public int getExpectedNumberOfAttendees() {
        return ExpectedNumberOfAttendees.get();
    }

    public IntegerProperty expectedNumberOfAttendeesProperty() {
        return ExpectedNumberOfAttendees;
    }

    public void setExpectedNumberOfAttendees(int expectedNumberOfAttendees) {
        this.ExpectedNumberOfAttendees.set(expectedNumberOfAttendees);
    }

    public String getSpecialRequests() {
        return SpecialRequests.get();
    }

    public StringProperty specialRequestsProperty() {
        return SpecialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.SpecialRequests.set(specialRequests);
    }

    public String getStartTime() {
        return StartTime.get();
    }

    public StringProperty startTimeProperty() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        this.StartTime.set(startTime);
    }

    public String getEndTime() {
        return EndTime.get();
    }

    public StringProperty endTimeProperty() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        this.EndTime.set(endTime);
    }

    public String getDatePicker() {
        return datePicker.get();
    }

    public StringProperty datePickerProperty() {
        return datePicker;
    }

    public void setDatePicker(String datePicker) {
        this.datePicker.set(datePicker);
    }
}


