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
public class DefaultFilmController {
    
    public void registerFilmFromConsoleInput(){
        Scanner sc= new Scanner (System.in);
        System.out.println(" Quel est le titre du film?");
        String titre= sc.nextLine();  
    }  
}
