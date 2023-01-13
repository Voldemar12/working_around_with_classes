public class Patient {
    String counter;

    public Patient(String counter) {
        this.counter = counter;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        if (counter != null) {
            this.counter = counter;
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "counter='" + counter + '\'' +
                '}';
    }
}
