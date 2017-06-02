/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.service;

import com.mycompany.dvdstore.core.repository.FileFilmDao;
import com.mycompany.dvdstore.core.repository.HibernateFilmDao;
import com.mycompany.dvdstore.core.repository.JdbcFilmDao;
import fr.utbm.entity.Film;
import java.io.Serializable;
import java.sql.SQLException;

/**
 *
 * @author agueye
 */
public class FilmService implements Serializable{
    
        public void registerFilm(Film f) throws SQLException
        {
            FileFilmDao fileDao=new FileFilmDao();
            fileDao.save(f);
            //System.out.printf(f.toString());
            
           //TD2
            JdbcFilmDao jdbcDao=new JdbcFilmDao();
            jdbcDao.save(f);
            
            HibernateFilmDao hibernateFilmDao=new HibernateFilmDao();
            hibernateFilmDao.insetFilm(f);
        }
   
}
