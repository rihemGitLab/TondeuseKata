package com.kata.factory;

import com.kata.model.Orientation;
import com.kata.model.Tondeuse;

public class RotationGaucheMovement implements GenericInstructionMovement{
	
	private final Tondeuse tondeuse;
	
	

	public RotationGaucheMovement(Tondeuse tondeuse) {
		super();
		this.tondeuse = tondeuse;
	}



	/**
	 *  pivoter la tondeuse de 90° à gauche 
	 *  
	 */
	       public Tondeuse move() {
		    Orientation orientation = tondeuse.getOrientation();
		    Orientation[] Orientations = Orientation.values();
		    int newOrdinal = (orientation.ordinal()+1+Orientations.length)%Orientations.length;
		    tondeuse.setOrientation(Orientations[newOrdinal]);
		    return tondeuse;
		
	}
	
}
