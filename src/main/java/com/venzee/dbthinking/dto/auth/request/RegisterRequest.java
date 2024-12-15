package com.venzee.dbthinking.dto.request;

import com.venzee.dbthinking.entites.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String username;
    private String password;
    private RoleEnum role;
}
