import java.time.LocalDateTime;

public class Appointment {
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private LocalDateTime appointmentDate;
    private String status; // Possible values: "Pending", "Confirmed", "Canceled", "Completed"

    // Constructor
    public Appointment(String appointmentID, String patientID, String doctorID, LocalDateTime appointmentDate, String status) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    // Getter and Setter methods
    public String getAppointmentID() {
        return appointmentID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to cancel the appointment
    public void cancelAppointment() {
        this.status = "Canceled";
    }

    // Method to confirm the appointment
    public void confirmAppointment() {
        this.status = "Confirmed";
    }

    // Display appointment details
    public void displayAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Status: " + status);
    }
}

