package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class User extends BaseEntity{
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String phone;
    private boolean enabled;
    private Role role;
    private Gender gender;

    public User(
            Long id,
            LocalDateTime insertDateTime,
            Long insertUserId,
            LocalDateTime updateDateTime,
            Long lastUpdateUserId,
            String firstname,
            String lastname,
            String username,
            String password,
            String phone,
            boolean enabled,
            Role role,
            Gender gender
    ) {
        super(id, insertDateTime, insertUserId, updateDateTime, lastUpdateUserId);
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }
}
