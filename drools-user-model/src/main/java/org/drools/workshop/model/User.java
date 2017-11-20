/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class User{
    private String username;
    private String password;
    public User(String username, String password){
       this.username = username;
       this.password = password;
    }
    public User(){
    
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public boolean validatePass(String pass){
        return this.password.equals(pass.toLowerCase());
    }
}
