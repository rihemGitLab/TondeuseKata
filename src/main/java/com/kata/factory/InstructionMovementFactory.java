package com.kata.factory;

import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;

public class InstructionMovementFactory implements  AbstractInstructionMovementFactory<GenericInstructionMovement>{

	public GenericInstructionMovement createMovementInstruction(Tondeuse tondeuse, Pelouse pelouse,String movement) {
		
		switch (movement) {
		 case "A":
			return new  AvancementMovement(tondeuse,pelouse);
		 case "G":
			 return	 new RotationGaucheMovement(tondeuse);
		 case "D":
			 return new RotationDroiteMovement(tondeuse);
		default: 
			return null;
		}
	 }
	
}
