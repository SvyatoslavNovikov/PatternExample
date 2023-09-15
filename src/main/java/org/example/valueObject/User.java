package org.example.valueObject;

public class User {

    String firstName = "Piter";
    String lastName = "Parker";
    String middleName = "Ben";
    String nickName = "Spider_man";
    String birthDay = "1.08.1975";
    String favoriteActivity = "Save neighbors";


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }
}
