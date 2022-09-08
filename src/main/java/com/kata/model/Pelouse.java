package com.kata.model;

import java.util.Objects;

public class Pelouse {
	
	  private int longueur;
	  private int hauteur;
	  
	  
	public Pelouse(int longueur, int hauteur) {
		super();
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hauteur, longueur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelouse other = (Pelouse) obj;
		return hauteur == other.hauteur && longueur == other.longueur;
	}

	@Override
	public String toString() {
		return "Pelouse [longueur=" + longueur + ", hauteur=" + hauteur + "]";
	}
	  
	  

}
