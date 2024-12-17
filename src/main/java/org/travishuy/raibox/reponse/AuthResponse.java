package org.travishuy.raibox.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.travishuy.raibox.model.User;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private User user;
}
