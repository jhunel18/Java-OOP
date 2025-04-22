package EncapsulationDemo.healthcare;

public class TestPatientRecord {
        public static void main(String[] args) {
            // Create a new patient record
            PatientRecord patient = new PatientRecord("Jhunel", "Hypertension", "Losartan");

            // Unauthorized access attempt
            System.out.println(patient.getMedicalHistory("Nurse"));

            // Authorized access and update by a doctor
            System.out.println(patient.getMedicalHistory("Doctor"));
            patient.updateMedicalHistory("Doctor", "Hypertension, Diabetes");

            // Pharmacist accessing prescriptions
            System.out.println(patient.getPrescriptions("Pharmacist"));
        }
}
