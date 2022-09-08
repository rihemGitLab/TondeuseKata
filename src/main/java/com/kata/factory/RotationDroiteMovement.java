package com.kata.factory;

import com.kata.model.Orientation;
import com.kata.model.Tondeuse;

public class RotationDroiteMovement implements GenericInstructionMovement {

	private final Tondeuse tondeuse;
	
	
	   public RotationDroiteMovement(Tondeuse tondeuse) {
		super();
		this.tondeuse = tondeuse;
	}


	   /**
	   * pivoter la tondeuse de 90° à droite 
	   *
	   */
	  public Tondeuse move() {
	    Orientation orientation = tondeuse.getOrientation();
		Orientation[] orientations = Orientation.values();
	    int newOrdinal = (orientation.ordinal()+1)%orientations.length;
	    tondeuse.setOrientation(orientations[newOrdinal]);
	    return tondeuse;
	  }
}
