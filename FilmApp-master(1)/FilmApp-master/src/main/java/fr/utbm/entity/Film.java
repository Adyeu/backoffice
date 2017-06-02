/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author agueye
 */
public class Film implements Serializable{
    
    private String titre;
    private String genre;
    private Integer nbExemplaires;

    public Film(String titre, String genre, Integer nbExemplaires) {
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
    }

    public Film() {
    }

    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNbExemplaires() {
        return nbExemplaires;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.titre);
        hash = 83 * hash + Objects.hashCode(this.genre);
        hash = 83 * hash + Objects.hashCode(this.nbExemplaires);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.nbExemplaires, other.nbExemplaires)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Film{" + "titre=" + titre + ", genre=" + genre + ", nbExemplaires=" + nbExemplaires + '}';
    }
    public void setNbExemplaires(Integer nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }


}
