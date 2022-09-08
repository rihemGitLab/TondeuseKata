package com.kata;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.kata.factory.InstructionMovementFactory;
import com.kata.factory.InstructionMovementFactoryProviderImpl;
import com.kata.model.Pelouse;
import com.kata.model.TondeuseInstruction;
import com.kata.utils.FileReaderUtils;
import com.kata.utils.PelouseReader;
import com.kata.utils.TondeuseInstructionReader;



public class TondeuseApplication {
	

	 private static final  Logger LOGGER = Logger.getLogger(TondeuseApplication.class.getName());

	    public static void main(String[] args) throws IOException {

	        if (args == null || args.length == 0) {
	            throw new IllegalArgumentException("Veuillez indiquer le chemin de votre fichier");
	        }

	        List<String> fileLines = FileReaderUtils.readFileLines(args[0]);


	            Pelouse pelouse = PelouseReader.read(fileLines);

	            List<TondeuseInstruction> tondeuseInstructions = TondeuseInstructionReader.read(fileLines);

	            InstructionMovementFactoryProviderImpl instructionMovementFactoryProvider = new InstructionMovementFactoryProviderImpl(new InstructionMovementFactory());

	            String output = instructionMovementFactoryProvider.runInputFileInstructions(tondeuseInstructions, pelouse);

	            LOGGER.info(output);

	    }

}
