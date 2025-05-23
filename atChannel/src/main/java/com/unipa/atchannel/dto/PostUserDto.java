package com.unipa.atchannel.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostUserDto {

    private int userId;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String nametag;
    private String pic_path;
    private String cover_path;
    private int follower;
    private int following;

    @Override
    public String toString() {
        return "PostUserDto{" +
                "user_id=" + userId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", nametag='" + nametag + '\'' +
                ", pic_path='" + pic_path + '\'' +
                ", cover_path='" + cover_path + '\'' +
                ", follower=" + follower +
                ", following=" + following +
                '}';
    }
}
