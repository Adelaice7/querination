package com.shardco.querinationweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private byte[] profilePic;
    private boolean darkModeOn;

    public User() {
        // empty
    }

    public User(Long id, String username, String email, String passwordHash, byte[] profilePic, boolean darkModeOn) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.profilePic = profilePic;
        this.darkModeOn = darkModeOn;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public byte[] getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(byte[] profilePic) {
        this.profilePic = profilePic;
    }

    public boolean isDarkModeOn() {
        return darkModeOn;
    }

    public void setDarkModeOn(boolean darkModeOn) {
        this.darkModeOn = darkModeOn;
    }
}
