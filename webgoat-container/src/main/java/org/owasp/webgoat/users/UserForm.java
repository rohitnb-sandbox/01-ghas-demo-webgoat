package org.owasp.webgoat.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author nbaars
 * @since 3/19/17.
 */
public class UserForm {
    @NotNull
    @Size(min = 6, max = 45)
    @Pattern(regexp = "[a-z0-9-]*", message = "can only contain lowercase letters, digits, and -")
    private String username;
    @NotNull
    @Size(min = 6, max = 10)
    private String password;
    @NotNull
    @Size(min = 6, max = 10)
    private String matchingPassword;
    @NotNull
    private String agree;

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getMatchingPassword() {
        return this.matchingPassword;
    }

    public String getAgree() {
        return this.agree;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setMatchingPassword(final String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public void setAgree(final String agree) {
        this.agree = agree;
    }
}
