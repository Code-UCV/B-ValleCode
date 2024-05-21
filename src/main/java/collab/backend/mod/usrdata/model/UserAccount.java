package collab.backend.mod.usrdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "user_account")
@Getter
public class UserAccount {
    @Id
    private int id;
    private String username;
    private String rank_;
}