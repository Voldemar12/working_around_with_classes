public class User {
    String firstName;
    String lastName;

    public User(){this.firstName = ""; this.lastName = "";}

      public void setLastName(String lastName) {
        if (lastName != "") {
            this.lastName = lastName;
        }

    }

    public String setFirstName(String firstName) {
        if (firstName != "") {
            this.firstName = firstName;
        }
        return firstName;
    }

     public String getFullName() {
        String sentence = "";
        if(this.firstName!=""&& this.lastName !=""){sentence = this.firstName + "" + this.lastName;}
        else if(this.firstName!=""&&this.lastName ==""){ sentence = this.firstName;}
        else if (this.firstName =="" && this.lastName != ""){
            sentence = this.lastName;
        } else {
            sentence = "Undefined";
        }
        return sentence;
    }
}
