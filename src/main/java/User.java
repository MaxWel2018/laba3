import javafx.util.Builder;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int code;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.code = builder.code;

    }

    static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private String password;
        private int code;

        User build() {
            return new User(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withCode(int code) {
            this.code = code;
            return this;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getCode() {
        return code;
    }
}
