package com.kata.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kata.model.Coordonnees;
import com.kata.model.Orientation;
import com.kata.model.Tondeuse;
import com.kata.model.TondeuseInstruction;



public class TondeuseInstructionReader {
	
	public static final String SEPARATOR = " ";

	
	  public static List<TondeuseInstruction> read(List<String> filerows) {
	        List<TondeuseInstruction> tondeuseInstructions = new ArrayList<>();

	        for (int lineNumber = 1; lineNumber < filerows.size(); lineNumber = lineNumber + 2) {

	        	 String [] tondeuseInitialPositionLine = filerows.get(lineNumber).split(SEPARATOR);

	            int x = Integer.parseInt(tondeuseInitialPositionLine[0]);
	            int y = Integer.parseInt(tondeuseInitialPositionLine[1]);
	            Orientation orientation = Orientation.valueOfKey(tondeuseInitialPositionLine[2]);
	            String instructions = filerows.get(lineNumber + 1);
	            String[] instructionTab = instructions.split("");
	            
	            Coordonnees coordonnees=new Coordonnees(x,y);
	            Tondeuse tondeuse =new Tondeuse( coordonnees, orientation);
	            TondeuseInstruction tondeuseInstruction = new TondeuseInstruction(tondeuse, Arrays.asList(instructionTab));
	            tondeuseInstructions.add(tondeuseInstruction);
	        }

	        return tondeuseInstructions;
	    }

}
