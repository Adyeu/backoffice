/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdstore.core.repository;

import fr.utbm.entity.Film;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeRegExp.test;


/**
 *
 * @author agueye
 */
public class FileFilmDao {

    public void save(Film f){
        FileWriter writer;
        try {
            writer=new FileWriter("U:\\Documents\\LO54\\films.txt",true);
            writer.write("nom_film\n");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileFilmDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
