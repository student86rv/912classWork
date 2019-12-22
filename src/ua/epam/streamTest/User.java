package ua.epam.streamTest;

import java.util.Date;

public class User{

    int id;
    String firstName;
    String lastName;
    String email;
    Date created;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, Date created) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                '}';
    }
}
