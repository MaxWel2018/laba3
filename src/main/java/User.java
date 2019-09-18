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
            if (name != null)
                this.name = name;
            else
                this.name = "";
            return this;
        }

        Builder withSurname(String surname) {
            if (surname != null)
                this.surname = surname;
            else
                this.surname = "";
            return this;
        }

        public Builder withEmail(String email) {
            if (email != null)
                this.email = email;
            else
                this.email = "";
            return this;
        }

        public Builder withPassword(String password) {
            if (password != null)
                this.password = password;
            else
                this.password = "";
            return this;
        }

        public Builder withCode(int code) {
            if (code > 0)
                this.code = code;
            else
                this.code = 0;
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
