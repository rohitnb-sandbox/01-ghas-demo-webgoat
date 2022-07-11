/*
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2019 Bruce Mayhew
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * Getting Source ==============
 *
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software projects.
 */
package org.owasp.webgoat.password_reset;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PasswordResetEmail implements Serializable {
    private LocalDateTime time;
    private String contents;
    private String sender;
    private String title;
    private String recipient;

    PasswordResetEmail(final LocalDateTime time, final String contents, final String sender, final String title, final String recipient) {
        this.time = time;
        this.contents = contents;
        this.sender = sender;
        this.title = title;
        this.recipient = recipient;
    }


    public static class PasswordResetEmailBuilder {
        private LocalDateTime time;
        private String contents;
        private String sender;
        private String title;
        private String recipient;

        PasswordResetEmailBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public PasswordResetEmail.PasswordResetEmailBuilder time(final LocalDateTime time) {
            this.time = time;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PasswordResetEmail.PasswordResetEmailBuilder contents(final String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PasswordResetEmail.PasswordResetEmailBuilder sender(final String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PasswordResetEmail.PasswordResetEmailBuilder title(final String title) {
            this.title = title;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PasswordResetEmail.PasswordResetEmailBuilder recipient(final String recipient) {
            this.recipient = recipient;
            return this;
        }

        public PasswordResetEmail build() {
            return new PasswordResetEmail(this.time, this.contents, this.sender, this.title, this.recipient);
        }

        @Override
        public String toString() {
            return "PasswordResetEmail.PasswordResetEmailBuilder(time=" + this.time + ", contents=" + this.contents + ", sender=" + this.sender + ", title=" + this.title + ", recipient=" + this.recipient + ")";
        }
    }

    public static PasswordResetEmail.PasswordResetEmailBuilder builder() {
        return new PasswordResetEmail.PasswordResetEmailBuilder();
    }

    public LocalDateTime getTime() {
        return this.time;
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

    public void setTime(final LocalDateTime time) {
        this.time = time;
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
        if (!(o instanceof PasswordResetEmail)) return false;
        final PasswordResetEmail other = (PasswordResetEmail) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
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
        return other instanceof PasswordResetEmail;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
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
        return "PasswordResetEmail(time=" + this.getTime() + ", contents=" + this.getContents() + ", sender=" + this.getSender() + ", title=" + this.getTitle() + ", recipient=" + this.getRecipient() + ")";
    }
}
