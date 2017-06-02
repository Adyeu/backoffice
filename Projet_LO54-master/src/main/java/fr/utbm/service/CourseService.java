/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.service;

import java.io.Serializable;
import java.sql.SQLException;
import fr.utbm.entity.Course;
import fr.utbm.repository.CourseDAO;

/**
 *
 * @author agueye
 */
public class CourseService implements Serializable{
    
     public void listerCours(Course course) throws SQLException
        {
            CourseDAO courseDao=new CourseDAO();
            courseDao.inscrire(course);
        
           
        }
    
    
    
}
