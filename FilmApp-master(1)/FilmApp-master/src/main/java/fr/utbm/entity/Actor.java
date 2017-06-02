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

public class Actor  implements java.io.Serializable {


     private int id;
     private String lastname;
     private String firstname;

    public Actor() {
    }

	
    public Actor(int id, String lastname) {
        this.id = id;
        this.lastname = lastname;
    }
    public Actor(int id, String lastname, String firstname) {
       this.id = id;
       this.lastname = lastname;
       this.firstname = firstname;
    }
}