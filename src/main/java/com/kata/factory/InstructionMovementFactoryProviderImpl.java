package com.kata.factory;

import java.util.List;
import java.util.stream.Collectors;

import com.kata.model.Instruction;
import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;
import com.kata.model.TondeuseInstruction;

public class InstructionMovementFactoryProviderImpl {
	
	 public static final String SPACE = " ";
	 private final AbstractInstructionMovementFactory<GenericInstructionMovement> movementFactory;

	public InstructionMovementFactoryProviderImpl(
			AbstractInstructionMovementFactory<GenericInstructionMovement> movementFactory) {
		super();
		this.movementFactory = movementFactory;
	}

	
	 private String getFinalPositionTondeuse(Tondeuse tondeuse) {
	        return tondeuse.getCoordonnees().getX() + SPACE +
	        		tondeuse.getCoordonnees().getY() + SPACE +
	        		tondeuse.getOrientation().getKey()+ SPACE ;
	 }
	 
	private String runInstruction(TondeuseInstruction TondeuseInstruction, Pelouse pelouse) {
		List<String> instructions =TondeuseInstruction.getInstructions();
		Tondeuse tondeuse =TondeuseInstruction.getTondeuse();
		 for (int i = 0; i < instructions.size(); i++) {
			 String instruction = instructions.get(i);
	         GenericInstructionMovement  genericInstructionMovement=movementFactory.createMovementInstruction(tondeuse, pelouse,instruction);
			 tondeuse = genericInstructionMovement.move();
		 }
		 return getFinalPositionTondeuse(tondeuse);
	}

    public String runInputFileInstructions(List<TondeuseInstruction> tondeuseInstructions, Pelouse pelouse) {
        return tondeuseInstructions.stream()
                .map(TondeuseInstruction -> this.runInstruction(TondeuseInstruction,pelouse))
                .collect(Collectors.joining())
                .trim();
    }



}
