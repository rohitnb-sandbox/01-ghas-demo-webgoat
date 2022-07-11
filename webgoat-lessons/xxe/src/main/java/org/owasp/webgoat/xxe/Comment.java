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
package org.owasp.webgoat.xxe;

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

    @Override
    public String toString() {
        return "Comment(user=" + this.getUser() + ", dateTime=" + this.getDateTime() + ", text=" + this.getText() + ")";
    }
}
