package org.owasp.webgoat.password_reset.resetlink;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author nbaars
 * @since 8/18/17.
 */
public class PasswordChangeForm {
    @NotNull
    @Size(min = 6, max = 10)
    private String password;
    private String resetLink;

    public String getPassword() {
        return this.password;
    }

    public String getResetLink() {
        return this.resetLink;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setResetLink(final String resetLink) {
        this.resetLink = resetLink;
    }
}
