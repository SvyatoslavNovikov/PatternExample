package builderTest;

import org.example.builder.User_NoPattern;
import org.example.builder.User_Pattern;
import org.testng.annotations.Test;

public class BuilderTest {

    @Test
    public void noBuilderTest() {
        User_NoPattern user = new User_NoPattern("token", "id234", "superhero");
        user.setName("Clark Kent");

        System.out.println(user.getName());
        System.out.println(user.getRole());
        System.out.println(user.getUserId());
        System.out.println(user.getToken());
    }

    @Test
    public void withBuilderTest() {
        User_Pattern user = User_Pattern.newUserBuilder()
                .withName("Piter Parker")
                .withRole("superhero")
                .setId("id 765")
                .setToken("token")
                .build();

        System.out.println(user.getName());
        System.out.println(user.getRole());
        System.out.println(user.getUserId());
        System.out.println(user.getToken());
    }

    @Test
    public void withFastBuilderTest() {
        User_Pattern user = User_Pattern.newFastUserBuilder();

        System.out.println(user.getName());
        System.out.println(user.getRole());
        System.out.println(user.getUserId());
        System.out.println(user.getToken());
    }
}
