package factory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.kata.factory.AbstractInstructionMovementFactory;
import com.kata.factory.GenericInstructionMovement;
import com.kata.factory.InstructionMovementFactory;
import com.kata.model.Coordonnees;
import com.kata.model.Orientation;
import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;

public class RotationDroiteMovementTest {
	
	
    private final AbstractInstructionMovementFactory<GenericInstructionMovement>  instructionMovementFactory= new InstructionMovementFactory();

    @DisplayName(" La tondeuse doit changer la direction vert le Est quand elle pivote à DROITE")
	   @Test
	     public void shouldChangeDirectionToTheEastWhenRotateToTheNorth() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("N"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(10, 10),"D");
			 tondeuse = genericInstructionMovement.move();
			 assertEquals("E",tondeuse.getOrientation().getKey());
	    }
	   

    @DisplayName(" La tondeuse doit changer la direction vert le SUD quand elle pivote à DROITE")
	   @Test
	     public void shouldChangeDirectionToTheEastWhenRotateToTheNorths() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("E"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(10, 10),"D");
			 tondeuse = genericInstructionMovement.move();
			 assertEquals("S",tondeuse.getOrientation().getKey());
	    }
}
