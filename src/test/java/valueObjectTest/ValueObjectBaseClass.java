package valueObjectTest;

import org.example.valueObject.User;

public class ValueObjectBaseClass {

    void print(
            String firstName,
            String lastName,
            String middleName,
            String nickName,
            String birthDay,
            String favoriteActivity
    ) {
        System.out.println("********************");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleName);
        System.out.println(nickName);
        System.out.println(birthDay);
        System.out.println(favoriteActivity);
    }

    void print(User user) {
        System.out.println("********************");
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getMiddleName());
        System.out.println(user.getNickName());
        System.out.println(user.getBirthDay());
        System.out.println(user.getFavoriteActivity());
    }
}
