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
package org.owasp.webgoat.vulnerable_components;

public class ContactImpl implements Contact {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;

	public ContactImpl() {
	}

	public Integer getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ContactImpl)) return false;
		final ContactImpl other = (ContactImpl) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$firstName = this.getFirstName();
		final Object other$firstName = other.getFirstName();
		if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
		final Object this$lastName = this.getLastName();
		final Object other$lastName = other.getLastName();
		if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
		final Object this$email = this.getEmail();
		final Object other$email = other.getEmail();
		if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ContactImpl;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $firstName = this.getFirstName();
		result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
		final Object $lastName = this.getLastName();
		result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
		final Object $email = this.getEmail();
		result = result * PRIME + ($email == null ? 43 : $email.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ContactImpl(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", email=" + this.getEmail() + ")";
	}
}
