package mx.edu.utez.marketplace.contact;

import javax.validation.constraints.NotBlank;

public class EmailDTO {
    @NotBlank
    private String fullname;
    @NotBlank
    private String email;
    @NotBlank
    private String comments;

    public EmailDTO(String fullname, String email, String comments) {
        this.fullname = fullname;
        this.email = email;
        this.comments = comments;
    }

    public EmailDTO() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
