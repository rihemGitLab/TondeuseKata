package factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.kata.factory.AbstractInstructionMovementFactory;
import com.kata.factory.GenericInstructionMovement;
import com.kata.factory.InstructionMovementFactory;
import com.kata.factory.InstructionMovementFactoryProviderImpl;
import com.kata.model.Coordonnees;
import com.kata.model.Orientation;
import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;
import com.kata.model.TondeuseInstruction;

public class InstructionMovementFactoryProviderTest {
	
	
    private final AbstractInstructionMovementFactory<GenericInstructionMovement>  instructionMovementFactory= new InstructionMovementFactory();

    @Test
    @DisplayName("Should return Expected Final RESULT 1 3 N 5 1 E ")
    void ShouldReturnExpectedFinalResult() {

    	  InstructionMovementFactoryProviderImpl instructionMovementFactoryProvider = new InstructionMovementFactoryProviderImpl(new InstructionMovementFactory());


    		
			  String instructions1="GAGAGAGAA";
			  String[] instructionsTondeuse1 = instructions1.split("");
			  Tondeuse tondeuse1 =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("N"));
			  TondeuseInstruction tondeuseInstruction1 =new TondeuseInstruction(tondeuse1,Arrays.asList(instructionsTondeuse1));
			  String instructions2="AADAADADDA";
			  String[] instructionsTondeuse2 = instructions2.split("");
			  Tondeuse tondeuse2 =new Tondeuse(new Coordonnees(3,3),Orientation.valueOfKey("E"));
			  TondeuseInstruction tondeuseInstruction2 =new TondeuseInstruction(tondeuse2,Arrays.asList(instructionsTondeuse2));
              List<TondeuseInstruction> tondeuseInstructions = new ArrayList<>();
              tondeuseInstructions.add(tondeuseInstruction1);
              tondeuseInstructions.add(tondeuseInstruction2);

              Pelouse pelouse = new Pelouse(5,5);
              String resultatFinal = instructionMovementFactoryProvider.runInputFileInstructions(tondeuseInstructions, pelouse);
              assertEquals("1 3 N 5 1 E",resultatFinal);
    }

}
