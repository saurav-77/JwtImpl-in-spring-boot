package me.saurav.learnjwt.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponseUserDto {

    private String jwt;
    private String username;
    private List<String> roles;

}
