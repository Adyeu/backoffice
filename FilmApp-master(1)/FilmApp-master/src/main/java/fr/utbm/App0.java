/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm;

import com.utbm.core.util.HibernateUtil;
import fr.utbm.entity.User;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author agueye
 */
public class App0 implements Serializable{
    
    public static void main(String[] args)  {
        User Abdou= new User();
        Abdou.setId(1);
        Abdou.setUserName("Adyeu");
        Abdou.setEnabled(true);
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().commit();
        session.close();
    } 
}
