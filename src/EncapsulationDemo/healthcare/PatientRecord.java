package EncapsulationDemo.healthcare;

class PatientRecord {
    // Private fields for sensitive data
    private String patientName;
    private String medicalHistory;
    private String prescriptions;

    // Constructor
    public PatientRecord(String patientName, String medicalHistory, String prescriptions) {
        this.patientName = patientName;
        this.medicalHistory = medicalHistory;
        this.prescriptions = prescriptions;
    }

    // Getter for patientName
    public String getPatientName() {
        return patientName;
    }

    // Getter for medicalHistory - Restricted to authorized users
    public String getMedicalHistory(String role) {
        if (role.equals("Doctor")) {
            return medicalHistory;
        } else {
            return "Access denied: Only doctors can view medical history.";
        }
    }

    // Setter for medicalHistory - Restricted to authorized users
    public void updateMedicalHistory(String role, String newHistory) {
        if (role.equals("Doctor")) {
            medicalHistory = newHistory;
            System.out.println("Medical history updated successfully.");
        } else {
            System.out.println("Access denied: Only doctors can update medical history.");
        }
    }

    // Getter for prescriptions - Restricted to authorized users
    public String getPrescriptions(String role) {
        if (role.equals("Doctor") || role.equals("Pharmacist")) {
            return prescriptions;
        } else {
            return "Access denied: Only doctors and pharmacists can view prescriptions.";
        }
    }

    // Setter for prescriptions - Restricted to authorized users
    public void updatePrescriptions(String role, String newPrescriptions) {
        if (role.equals("Doctor")) {
            prescriptions = newPrescriptions;
            System.out.println("Prescriptions updated successfully.");
        } else {
            System.out.println("Access denied: Only doctors can update prescriptions.");
        }
    }
}
