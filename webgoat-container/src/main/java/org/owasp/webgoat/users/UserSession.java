package org.owasp.webgoat.users;

import org.springframework.data.annotation.Id;

/**
 * @author nbaars
 * @since 8/15/17.
 */
public class UserSession {
    private WebGoatUser webGoatUser;
    @Id
    private String sessionId;

    public WebGoatUser getWebGoatUser() {
        return this.webGoatUser;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public UserSession(final WebGoatUser webGoatUser, final String sessionId) {
        this.webGoatUser = webGoatUser;
        this.sessionId = sessionId;
    }

    protected UserSession() {
    }
}
