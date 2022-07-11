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
package org.owasp.webwolf.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author nbaars
 * @since 3/19/17.
 */
public class UserForm {
    @NotNull
    @Size(min = 6, max = 40)
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
