/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm;

import com.mycompany.dvdstore.controller.RecupererFilmController;
import com.utbm.core.util.HibernateUtil;
import fr.utbm.entity.Film;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Scanner;
import org.hibernate.Session;

/**
 *
 * @author agueye
 */
public class App2 implements Serializable{
    
  public static void main(String[] args) {
   
	Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            RecupererFilmController recup=new RecupererFilmController();
            recup.recupererFilm();
            session.beginTransaction();
            
           // session.get(Film.class,recup.)
            
	    session.getTransaction().commit();
            
            } catch (Exception e) {
        }
    }
}

