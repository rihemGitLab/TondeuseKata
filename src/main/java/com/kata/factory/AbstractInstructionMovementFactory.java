package com.kata.factory;

import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;

public interface AbstractInstructionMovementFactory<GenericInstructionMovement> {
	
	GenericInstructionMovement createMovementInstruction(Tondeuse tondeuse, Pelouse pelouse,String movement);

}
