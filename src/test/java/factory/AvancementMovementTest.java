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



@DisplayName("Tests  demonstratifs du mouvement d'avancement de la tondondeuse")
public class AvancementMovementTest {
	
    private final AbstractInstructionMovementFactory<GenericInstructionMovement>  instructionMovementFactory= new InstructionMovementFactory();


    
	   @DisplayName(" La tondeuse doit avancer vers le North et incrementer la position Y ")
	   @Test
	     public void shouldIncrementYWhenDirectionIsNorth() {
	    	Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("N"));

	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(10, 10),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(3,tondeuse.getCoordonnees().getY());
	    }
	   
	   @DisplayName(" La tondeuse doit avancer vers le SUD et decrementer la position Y ")    
	    @Test
	     public void shouldDecrementYWhenDirectionIsSouth() {
	    	Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("S"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(1,tondeuse.getCoordonnees().getY());
	    }
	    
	    @DisplayName(" La tondeuse doit avancer vers le Est et incrementer la position X ")
	    @Test
	     public void shouldIncrementXWhenDirectionIsEast() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("E"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(2,tondeuse.getCoordonnees().getX());
	    }

	    
	    @DisplayName(" La tondeuse doit avancer vers le Ouest et decrementer la position X ")
	    @Test
	     public void shouldDecrementXWhenDirectionIsWest() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(1,2),Orientation.valueOfKey("W"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5,5),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(0,tondeuse.getCoordonnees().getX());
	    }

	
	    @DisplayName("La tondeuse ne doit pas avancer  vers le Est si le mouvement est en dehors de la pelouse,la tondeuse ne bouge pas, conserve son orientation")
	    @Test
	     public void shouldNotMoveToTheEastWhenTheMovementIsOutsidePelous() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(5,1),Orientation.valueOfKey("E"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(5,tondeuse.getCoordonnees().getX());
	         assertEquals(1,tondeuse.getCoordonnees().getY());
	         assertEquals("E",tondeuse.getOrientation().getKey());
	    }
	    
	   
		@DisplayName("La tondeuse ne doit pas avancer  vers le North si le mouvement est en dehors de la pelouse,la tondeuse ne bouge pas, conserve son orientation")
	    @Test
	     public void shouldNotMovetoTheNorthWhenTheMovementIsOutsidePelouse() {
	    	 Tondeuse tondeuse =new Tondeuse(new Coordonnees(2,5),Orientation.valueOfKey("N"));
	         GenericInstructionMovement  genericInstructionMovement=instructionMovementFactory.createMovementInstruction(tondeuse, new Pelouse(5, 5),"A");
			 tondeuse = genericInstructionMovement.move();
	         assertEquals(2,tondeuse.getCoordonnees().getX());
	         assertEquals(5,tondeuse.getCoordonnees().getY());
	         assertEquals("N",tondeuse.getOrientation().getKey());
	    }
}
