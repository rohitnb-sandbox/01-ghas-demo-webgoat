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
 * Getting Source ==============
 *
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software projects.
 */
package org.owasp.webwolf.db;

import static org.owasp.webwolf.db.ActuatorDsJsonParser.getDsPropertyFromConfigProps;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Angel Olle Blazquez
 */
public class DataSourceProperties implements Serializable {
    private static final long serialVersionUID = -5897408528235134090L;
    private String url;
    private String driverClassName;

    @JsonProperty("contexts")
    protected void props(JsonNode node) {
        url = getDsPropertyFromConfigProps(node, "url");
        driverClassName = getDsPropertyFromConfigProps(node, "driverClassName");
    }

    public DataSourceProperties() {
    }

    public String getUrl() {
        return this.url;
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setDriverClassName(final String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataSourceProperties)) return false;
        final DataSourceProperties other = (DataSourceProperties) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$driverClassName = this.getDriverClassName();
        final Object other$driverClassName = other.getDriverClassName();
        if (this$driverClassName == null ? other$driverClassName != null : !this$driverClassName.equals(other$driverClassName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataSourceProperties;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $driverClassName = this.getDriverClassName();
        result = result * PRIME + ($driverClassName == null ? 43 : $driverClassName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DataSourceProperties(url=" + this.getUrl() + ", driverClassName=" + this.getDriverClassName() + ")";
    }
}
