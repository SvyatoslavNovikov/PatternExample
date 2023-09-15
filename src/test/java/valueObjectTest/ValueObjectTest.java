package valueObjectTest;

import org.example.valueObject.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValueObjectTest extends ValueObjectBaseClass{

    User user;

    @BeforeClass
    public void precondition() {
        user = new User();
    }

    @Test
    public void noValueObject() {
        print(
                user.getFirstName(),
                user.getLastName(),
                user.getMiddleName(),
                user.getNickName(),
                user.getBirthDay(),
                user.getFavoriteActivity()
        );
    }

    @Test
    public void withValueObject() {
        print(user);
    }

}
