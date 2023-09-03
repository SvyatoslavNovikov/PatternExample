package org.example.builder;

public class User_Pattern {

    private String userId;  // not final
    private String token;
    private String role;
    private String name;

    private User_Pattern() {
        // private constructor
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public static CreateUserBuilder newUserBuilder() {
        return new User_Pattern().new CreateUserBuilder();
    }

    public static User_Pattern newFastUserBuilder() {
        return new User_Pattern().new CreateUserBuilder()
                .setId("id569")
                .setToken("token")
                .withName("Bruce Wayne")
                .withRole("hero")
                .build();
    }

    public class CreateUserBuilder {

        private CreateUserBuilder() {
            // private constructor
        }

        public CreateUserBuilder setId(String userId) {
            User_Pattern.this.userId = userId;
            return this;
        }

        public CreateUserBuilder setToken(String token) {
            User_Pattern.this.token = token;
            return this;
        }

        public CreateUserBuilder withName(String name) {
            User_Pattern.this.name = name;
            return this;
        }

        public CreateUserBuilder withRole(String role) {
            User_Pattern.this.role = role;
            return this;
        }

        public User_Pattern build() {
            return User_Pattern.this;
        }

    }
    
}
