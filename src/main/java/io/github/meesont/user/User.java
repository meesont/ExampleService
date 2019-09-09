package io.github.meesont.user;

public class User {

    private String forename;
    private String surname;
    private int age;
    private String email;

    public User(String forename, String surname, int age, String email) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
