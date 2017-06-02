/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdstore.core.repository;

import com.utbm.core.util.HibernateUtil;
import fr.utbm.entity.Film;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author agueye
 */
public class HibernateFilmDao {
    
    public void insetFilm(Film film) {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    try {
	        session.beginTransaction();
	        session.persist(film);
	        session.getTransaction().commit();
		}
		catch (HibernateException he) {
	        he.printStackTrace();
	        if(session.getTransaction() != null) {
	            try {
	                session.getTransaction().rollback();
	            }catch(HibernateException he2) {he2.printStackTrace(); }
	        }
		}
		finally {
	        if(session != null) {
	                   try {
                        session.close();
                    } catch (Exception e) {
                    }
                }
            }
    }
}
                  
                    
   
