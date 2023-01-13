public class Main {
    public static void main(String[] args) {

        Example example = new Example();

        example.setId(20);
        example.setBalance(1500);
        example.setEnabled(true);

        System.out.println(example);

        Patient patient = new Patient("Null");
        patient.setCounter("Null");

        System.out.println(patient);

        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName());

    }
}