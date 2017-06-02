/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdstore.controller;

import java.util.Scanner;

/**
 *
 * @author agueye
 */
public class RecupererFilmController {
    
    public void recupererFilm(){
         Scanner sc= new Scanner (System.in);
         System.out.println (" Donner l'id du film souhaité");
         int idFilmCherche= sc.nextInt();   
    }  
}
