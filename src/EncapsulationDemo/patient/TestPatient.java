package EncapsulationDemo.patient;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient = new Patient();

        //Setting values
        patient.setName("Joshua");
        patient.setAge(21);

        //Get values
        System.out.println(patient.getName());
        System.out.println(patient.getAge());

        Patient patient2 = new Patient();
        patient2.setName("");
        patient2.setAge(0);

        System.out.println(patient2.getName());
        System.out.println(patient2.getAge());

    }
}
