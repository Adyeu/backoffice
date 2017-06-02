/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.entity;

/**
 *
 * @author agueye
 */
public class User {
    private long id;
    private String username;
    private boolean enabled ;

    public long getId() {
        return id;
    }
     public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return username;
    }
     public void setUserName(String userName) {
        this.username = userName;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
        
}
