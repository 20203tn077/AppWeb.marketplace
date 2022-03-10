package mx.edu.utez.marketplace.user.controller;

public class UserDTO {
    private long id;
    private String username;
    private String password;
    private Person person;
    private Set<Role> roles;

    public UserDTO() {
    }

    public UserDTO(String username, String password, Person person, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.roles = roles;
    }

    public UserDTO(long id, String username, String password, Person person, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.person = person;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
