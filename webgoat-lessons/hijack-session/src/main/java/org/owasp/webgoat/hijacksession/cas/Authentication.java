/*
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2021 Bruce Mayhew
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
 * Getting Source
 * ==============
 *
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software projects.
 */
package org.owasp.webgoat.hijacksession.cas;

import java.security.Principal;

/**
 * @author Angel Olle Blazquez
 */
public class Authentication implements Principal {
    private boolean authenticated = false;
    private String name;
    private Object credentials;
    private String id;

    public Authentication(String name, Object credentials, String id) {
        this.name = name;
        this.credentials = credentials;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    protected void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    protected void setId(String id) {
        this.id = id;
    }


    public static class AuthenticationBuilder {
        private String name;
        private Object credentials;
        private String id;

        AuthenticationBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public Authentication.AuthenticationBuilder name(final String name) {
            this.name = name;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Authentication.AuthenticationBuilder credentials(final Object credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public Authentication.AuthenticationBuilder id(final String id) {
            this.id = id;
            return this;
        }

        public Authentication build() {
            return new Authentication(this.name, this.credentials, this.id);
        }

        @Override
        public String toString() {
            return "Authentication.AuthenticationBuilder(name=" + this.name + ", credentials=" + this.credentials + ", id=" + this.id + ")";
        }
    }

    public static Authentication.AuthenticationBuilder builder() {
        return new Authentication.AuthenticationBuilder();
    }

    public boolean isAuthenticated() {
        return this.authenticated;
    }

    public Object getCredentials() {
        return this.credentials;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Authentication(authenticated=" + this.isAuthenticated() + ", name=" + this.getName() + ", credentials=" + this.getCredentials() + ", id=" + this.getId() + ")";
    }
}
