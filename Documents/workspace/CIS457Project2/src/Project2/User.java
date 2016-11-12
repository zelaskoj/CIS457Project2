/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author Jacob
 */
public class User {
    private String username;
    private String hostname;
    private String speed;
    
    public User(String username, String hostname, String speed){
        username = this.username;
        hostname = this.hostname;
        speed = this.speed;
    }
    
    public String getUsername(){
        return this.username;
    }
    public String getHostname(){
        return this.hostname;
    }
    public String getSpeed(){
        return this.hostname;
    }
}
