package com.kata.factory;

import java.util.List;

import com.kata.model.Pelouse;
import com.kata.model.TondeuseInstruction;

public interface InstructionMovementFactoryProvider {
	
	 public String runInputFileInstructions(List<TondeuseInstruction> tondeuseInstructions, Pelouse pelouse) ;

}
