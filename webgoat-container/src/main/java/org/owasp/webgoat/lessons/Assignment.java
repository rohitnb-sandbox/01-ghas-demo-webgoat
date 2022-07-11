package org.owasp.webgoat.lessons;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ************************************************************************************************
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details,
 * please see http://www.owasp.org/
 * <p>
 * Copyright (c) 2002 - 2014 Bruce Mayhew
 * <p>
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 * <p>
 * Getting Source ==============
 * <p>
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software
 * projects.
 * <p>
 *
 * @author nbaars
 * @version $Id: $Id
 * @since November 25, 2016
 */
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String path;
    @Transient
    private List<String> hints;

    private Assignment() {
        //Hibernate
    }

    public Assignment(String name) {
        this(name, name, new ArrayList<>());
    }

    public Assignment(String name, String path, List<String> hints) {
        if (path.equals("") || path.equals("/") || path.equals("/WebGoat/")) {
            throw new IllegalStateException("The path of assignment \'" + name + "\' overrides WebGoat endpoints, please choose a path within the scope of the lesson");
        }
        this.name = name;
        this.path = path;
        this.hints = hints;
    }

    /**
     * Set path is here to overwrite stored paths.
     * Since a stored path can no longer be used in a lesson while
     * the lesson (name) itself is still part of the lesson.
     *
     * @param pathName the path
     */
    public void setPath(String pathName) {
        this.path = pathName;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public List<String> getHints() {
        return this.hints;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Assignment)) return false;
        final Assignment other = (Assignment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$path = this.getPath();
        final Object other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) return false;
        final Object this$hints = this.getHints();
        final Object other$hints = other.getHints();
        if (this$hints == null ? other$hints != null : !this$hints.equals(other$hints)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Assignment;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $path = this.getPath();
        result = result * PRIME + ($path == null ? 43 : $path.hashCode());
        final Object $hints = this.getHints();
        result = result * PRIME + ($hints == null ? 43 : $hints.hashCode());
        return result;
    }
}
