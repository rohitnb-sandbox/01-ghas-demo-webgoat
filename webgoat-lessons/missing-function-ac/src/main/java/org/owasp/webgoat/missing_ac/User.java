package org.owasp.webgoat.missing_ac;

public class User {
    private String username;
    private String password;
    private boolean admin;

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setAdmin(final boolean admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isAdmin() != other.isAdmin()) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isAdmin() ? 79 : 97);
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User(username=" + this.getUsername() + ", password=" + this.getPassword() + ", admin=" + this.isAdmin() + ")";
    }

    public User(final String username, final String password, final boolean admin) {
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public User() {
    }
}
