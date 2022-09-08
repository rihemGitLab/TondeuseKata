package factory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.kata.factory.AbstractInstructionMovementFactory;
import com.kata.factory.AvancementMovement;
import com.kata.factory.GenericInstructionMovement;
import com.kata.factory.InstructionMovementFactory;
import com.kata.factory.RotationDroiteMovement;
import com.kata.factory.RotationGaucheMovement;
import com.kata.model.Coordonnees;
import com.kata.model.Orientation;
import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;

public class InstructionMovementFactoryTest {

    private final AbstractInstructionMovementFactory<GenericInstructionMovement>  instructionMovementFactory= new InstructionMovementFactory();

	    @Test
	    @DisplayName("Should return RotationGaucheMovement INSTANCE when instruction is G ")
	    void shouldreturnRotationGaucheMovementWhenG() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(0,4),Orientation.valueOfKey("N"));
	    	GenericInstructionMovement instructionMovement = instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"G");
	        assertTrue(instructionMovement instanceof RotationGaucheMovement);
	    }

	 
	    @Test
	    @DisplayName("Should return RotationDroiteMovement INSTANCE when instruction is D ")
	    void shouldreturnRotationdROITEMovementWhenD() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(0,4),Orientation.valueOfKey("N"));
	    	GenericInstructionMovement instructionMovement = instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"D");
	        assertTrue(instructionMovement instanceof RotationDroiteMovement);
	    }
	    
	    
	    @Test
	    @DisplayName("Should return AvancementMovement INSTANCE when instruction is A ")
	    void shouldreturnAvancementMovementWhenA() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(0,4),Orientation.valueOfKey("N"));
	    	GenericInstructionMovement instructionMovement = instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"A");
	        assertTrue(instructionMovement instanceof AvancementMovement);
	    }

}
