package com.kata.model;

public class Tondeuse {
	
	private Coordonnees coordonnees;
	private Orientation orientation;
	
	
	public Tondeuse(Coordonnees coordonnee, Orientation orientation) {
		super();
		this.coordonnees = coordonnee;
		this.orientation = orientation;
	}
	public Coordonnees getCoordonnees() {
		return coordonnees;
	}
	public void setCoordonnees(Coordonnees coordonnee) {
		this.coordonnees = coordonnee;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordonnees == null) ? 0 : coordonnees.hashCode());
		result = prime * result + ((orientation == null) ? 0 : orientation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tondeuse other = (Tondeuse) obj;
		if (coordonnees == null) {
			if (other.coordonnees != null)
				return false;
		} else if (!coordonnees.equals(other.coordonnees))
			return false;
		if (orientation == null) {
			if (other.orientation != null)
				return false;
		} else if (!orientation.equals(other.orientation))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tondeuse [coordonnees=" + coordonnees + ", orientation=" + orientation + "]";
	}
	
	
}
