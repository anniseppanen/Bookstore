package k24.bookstore.domain;

import jakarta.persistence.*;

@Entity
@Table(name="app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id", nullable = false, updatable = false)
    private Long id;

    //@Column(name = "username", nullable = false, unique = true)
    private String username;

    //@Column(name = "password_hash", nullable = false)
    private String password_hash;

    //@Column(name = "email", nullable = false)
    private String email;

    //@Column(name = "role", nullable = false)
    private String role;

    public AppUser() {}

    public AppUser(String username, String password_hash, String email, String role) {
        super();
        this.username = username;
        this.password_hash = password_hash;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
            return id;
        }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpassword_hash() {
        return password_hash;
    }

    public void setpassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser [username=" + username + ", password_hash=" + password_hash + ", email=" + email + ", role=" + role + "]";
    }
}
