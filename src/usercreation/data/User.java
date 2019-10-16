package usercreation.data;

public class User {
    private String pesel;
    private int age;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String pesel, int age, String firstName, String lastName) {
        this.pesel = pesel;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
