
import java.io.Serializable;
import org.hibernate.Session;
import fr.utbm.entity.Course;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agueye
 */
public class App0 implements Serializable{
    
    public static void main(String[] args)  {
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Course c= new Course();
    c.setCode("LO54");
    c.setTitle("J2EE");
    
    }
}
