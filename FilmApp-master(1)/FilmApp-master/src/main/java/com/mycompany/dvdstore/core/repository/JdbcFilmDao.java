/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdstore.core.repository;

import fr.utbm.entity.Film;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author agueye
 */
public class JdbcFilmDao {
    public void save(Film f) throws SQLException{
        Connection con=null;
    try {
         Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/video", "video", "video");
          System.out.println("CONNEXION OK");
          
        Statement stmt=con.createStatement();
        int ins_film=stmt.executeUpdate("INSERT INTO MOVIE (TITLE,COPIES,MOVIE_TYPE) VALUES('"+f.getTitre()+"',"+f.getNbExemplaires()+",'"+f.getGenre()+"')");
        PreparedStatement prst=con.prepareStatement("INSERT INTO MOVIE (TITLE,COPIES,MOVIE_TYPE) VALUES(?,?,?)");
       /*prst.setString(1,f.setTitre('Rango'));
        ResultSet les_films=stmt.executeQuery("SELECT * FROM MOVIE");
        */
          
      } catch (Throwable e) {
          System.out.println("CONNEXION NOTOK");
          e.printStackTrace();
          
      } finally{
          try {
              if (con!=null) con.close();
          } 
          catch (SQLException ex) {}
      }    
     
    }  
}
