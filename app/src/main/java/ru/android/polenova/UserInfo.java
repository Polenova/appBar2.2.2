package ru.android.polenova;

public class UserInfo {
    String userName;
    String userFatherName;
    String userSurname;
    int userAge;

    public UserInfo(String userName, String userFatherName, String userSurname, int userAge) {
        this.userName = userName;
        this.userFatherName = userFatherName;
        this.userSurname = userSurname;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFatherName() {
        return userFatherName;
    }

    public void setUserFatherName(String userFatherName) {
        this.userFatherName = userFatherName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "пользователь: "  + userName  +
                " " + userFatherName  +
                " " + userSurname  +
                ", возраст " + userAge +
                " года";
    }
}
