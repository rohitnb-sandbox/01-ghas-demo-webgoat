package org.owasp.webgoat.webwolf_introduction;

import java.io.Serializable;

public class Email implements Serializable {
    private String contents;
    private String sender;
    private String title;
    private String recipient;

    Email(final String contents, final String sender, final String title, final String recipient) {
        this.contents = contents;
        this.sender = sender;
        this.title = title;
        this.recipient = recipient;
    }


    public static class EmailBuilder {
        private String contents;
        private String sender;
        private String title;
        private String recipient;

        EmailBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public Email.EmailBuilder contents(final String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Email.EmailBuilder sender(final String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Email.EmailBuilder title(final String title) {
            this.title = title;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Email.EmailBuilder recipient(final String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Email build() {
            return new Email(this.contents, this.sender, this.title, this.recipient);
        }

        @Override
        public String toString() {
            return "Email.EmailBuilder(contents=" + this.contents + ", sender=" + this.sender + ", title=" + this.title + ", recipient=" + this.recipient + ")";
        }
    }

    public static Email.EmailBuilder builder() {
        return new Email.EmailBuilder();
    }

    public String getContents() {
        return this.contents;
    }

    public String getSender() {
        return this.sender;
    }

    public String getTitle() {
        return this.title;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setContents(final String contents) {
        this.contents = contents;
    }

    public void setSender(final String sender) {
        this.sender = sender;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setRecipient(final String recipient) {
        this.recipient = recipient;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Email)) return false;
        final Email other = (Email) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contents = this.getContents();
        final Object other$contents = other.getContents();
        if (this$contents == null ? other$contents != null : !this$contents.equals(other$contents)) return false;
        final Object this$sender = this.getSender();
        final Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$recipient = this.getRecipient();
        final Object other$recipient = other.getRecipient();
        if (this$recipient == null ? other$recipient != null : !this$recipient.equals(other$recipient)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Email;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contents = this.getContents();
        result = result * PRIME + ($contents == null ? 43 : $contents.hashCode());
        final Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $recipient = this.getRecipient();
        result = result * PRIME + ($recipient == null ? 43 : $recipient.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Email(contents=" + this.getContents() + ", sender=" + this.getSender() + ", title=" + this.getTitle() + ", recipient=" + this.getRecipient() + ")";
    }
}
