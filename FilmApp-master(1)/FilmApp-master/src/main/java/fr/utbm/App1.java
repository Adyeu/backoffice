/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm;

import fr.utbm.entity.Film;
import fr.utbm.service.FilmService;
import java.io.Serializable;
import java.sql.SQLException;

/**
 *
 * @author agueye
 */
public class App1 implements Serializable{
    
    public static void main(String[] args) throws SQLException {
        Film f= new Film();
        f.setTitre("Kiroukou");
        f.setGenre("manga");
        f.setNbExemplaires(1);
        FilmService fs= new FilmService();
        fs.registerFilm(f);  
    }
    
}
