public class AdministratorMenu {

    public static void displayMenu() {
        System.out.println("\nAdministrator Menu:");
        System.out.println("1. View and Manage Hospital Staff");
        System.out.println("2. View Appointments Details");
        System.out.println("3. View and Manage Medication Inventory");
        System.out.println("4. Approve Replenishment Requests");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                manageHospitalStaff();
                break;
            case 2:
                viewAppointmentDetails();
                break;
            case 3:
                manageMedicationInventory();
                break;
            case 4:
                approveReplenishmentRequests();
                break;
            case 5:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void manageHospitalStaff() {
        System.out.println("Managing hospital staff...");
        // Implement managing hospital staff logic
    }

    private static void viewAppointmentDetails() {
        System.out.println("Viewing appointment details...");
        // Implement viewing appointment details logic
    }

    private static void manageMedicationInventory() {
        System.out.println("Managing medication inventory...");
        // Implement managing medication inventory logic
    }

    private static void approveReplenishmentRequests() {
        System.out.println("Approving replenishment requests...");
        // Implement approving replenishment requests logic
    }
}


