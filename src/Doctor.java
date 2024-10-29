public class Doctor extends User {
    // Additional attributes for Doctor
    private String doctorID;
    private String specialization;

    // Constructor
    public Doctor(String userID, String password, String doctorID, String specialization) {
        super(userID, password, "Doctor");
        this.doctorID = doctorID;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getDoctorID() {
        return doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Display doctor information
    public void displayDoctorInfo() {
        displayUserInfo(); // Calls the method from User class
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Specialization: " + specialization);
    }

    // Method to accept or decline appointment requests
    public void manageAppointmentRequest(String appointmentID, boolean accept) {
        if (accept) {
            System.out.println("Appointment " + appointmentID + " accepted.");
        } else {
            System.out.println("Appointment " + appointmentID + " declined.");
        }
    }
}
