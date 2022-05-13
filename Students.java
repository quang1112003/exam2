package exam2;

public class Students {
    String EnrollID;
    String FirstName;
    String LastName;
    Integer Age;

    public Students(String enrollID, String firstName, String lastName, Integer age) {
        EnrollID = enrollID;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public Students(){
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrollID) {
        EnrollID = enrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

}
