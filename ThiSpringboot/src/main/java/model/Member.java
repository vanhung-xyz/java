package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "members")

public class Member {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @OneToMany(mappedBy = "member")
    private Set<Role> roles;

    public Member(int userId, String username, String password, boolean isActive, Set<Role> roles) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.roles = roles;
    }

    public Member() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
