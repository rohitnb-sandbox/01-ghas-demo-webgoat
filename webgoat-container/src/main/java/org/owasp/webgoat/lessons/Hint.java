/***************************************************************************************************
 * 
 * 
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details,
 * please see http://www.owasp.org/
 * 
 * Copyright (c) 2002 - 2014 Bruce Mayhew
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
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software
 * projects.
 * 
 */
package org.owasp.webgoat.lessons;

/**
 * <p>Hint class.</p>
 *
 * @author rlawson
 * @version $Id: $Id
 */
public final class Hint {
    private final String hint;
    private final String assignmentPath;

    public Hint(final String hint, final String assignmentPath) {
        this.hint = hint;
        this.assignmentPath = assignmentPath;
    }

    public String getHint() {
        return this.hint;
    }

    public String getAssignmentPath() {
        return this.assignmentPath;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Hint)) return false;
        final Hint other = (Hint) o;
        final Object this$hint = this.getHint();
        final Object other$hint = other.getHint();
        if (this$hint == null ? other$hint != null : !this$hint.equals(other$hint)) return false;
        final Object this$assignmentPath = this.getAssignmentPath();
        final Object other$assignmentPath = other.getAssignmentPath();
        if (this$assignmentPath == null ? other$assignmentPath != null : !this$assignmentPath.equals(other$assignmentPath)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hint = this.getHint();
        result = result * PRIME + ($hint == null ? 43 : $hint.hashCode());
        final Object $assignmentPath = this.getAssignmentPath();
        result = result * PRIME + ($assignmentPath == null ? 43 : $assignmentPath.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Hint(hint=" + this.getHint() + ", assignmentPath=" + this.getAssignmentPath() + ")";
    }
}
