package org.travishuy.raibox.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phone;
    private boolean active;
    private UserRole role;
    private List<String> permissions;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
