package org.owasp.webgoat.xss;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nbaars
 * @since 4/8/17.
 */
@XmlRootElement
public class Comment {
    private String user;
    private String dateTime;
    private String text;

    public String getUser() {
        return this.user;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public String getText() {
        return this.text;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public void setDateTime(final String dateTime) {
        this.dateTime = dateTime;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Comment(final String user, final String dateTime, final String text) {
        this.user = user;
        this.dateTime = dateTime;
        this.text = text;
    }

    public Comment() {
    }
}
