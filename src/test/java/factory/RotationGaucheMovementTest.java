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

public class RotationGaucheMovementTest {
	
	
    private final AbstractInstructionMovementFactory<GenericInstructionMovement>  instructionMovementFactory= new InstructionMovementFactory();

    @DisplayName(" La tondeuse doit changer la direction vert le OUEST quand elle pivote à GAUCHE ")
	   @Test
	     public void shouldChangeDirectionToTheEastWhenRotateToTheNorth() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("S"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(10, 10),"G");
			 tondeuse = genericInstructionMovement.move();
			 assertEquals("W",tondeuse.getOrientation().getKey());
	    }
	   

    @DisplayName(" La tondeuse doit changer la direction vert le NORTH quand elle pivote à GAUCHE")
	   @Test
	     public void shouldChangeDirectionToTheEastWhenRotateToTheNorths() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("W"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(10, 10),"G");
			 tondeuse = genericInstructionMovement.move();
			 assertEquals("N",tondeuse.getOrientation().getKey());
	    }
}
