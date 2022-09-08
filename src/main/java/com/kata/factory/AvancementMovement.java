package com.kata.factory;

import java.util.logging.Logger;

import com.kata.model.Pelouse;
import com.kata.model.Tondeuse;

/**
 * @author rihem-laptop
 *
 */
public class AvancementMovement implements GenericInstructionMovement {
	
	 private static final  Logger LOGGER = Logger.getLogger(AvancementMovement.class.getName());
	 
	    private final Tondeuse tondeuse;
	    private final Pelouse pelouse;
	    
	    
	 
	public AvancementMovement(Tondeuse tondeuse, Pelouse pelouse) {
			super();
			this.tondeuse = tondeuse;
			this.pelouse = pelouse;
		}


	public Tondeuse move() {
		 switch (tondeuse.getOrientation().getKey()) {
	      case "N":
	          return moveToNorth();
	      case "W":
	          return moveToWest();
	      case "S":
	    	  return  moveToSouth();
	      case "E":
	    	  return moveToEast();
	    }
	    return null;
	}


    
    /**
     * Fait avancer la tondeuse d'une position vers l'Ouest ( x-1 )
     */
    private Tondeuse moveToWest() {
    	
    	int ouestXPosition = tondeuse.getCoordonnees().getX() -1 ;
    	
        if (ouestXPosition > pelouse.getLongueur()) {
          LOGGER.info("le mouvement est en dehors de la pelouse, la tondeuse ne peut pas bouger vers l'ouest");
        }else {
            tondeuse.getCoordonnees().setX(ouestXPosition);
        }
        return tondeuse;

    }
    
    /**
     * Fait avancer la tondeuse d'une position vers l'Est ( x+1 )
     */
    private Tondeuse moveToEast() {
    	
    	int estXPosition = tondeuse.getCoordonnees().getX()+1;
    	
        if (estXPosition > pelouse.getLongueur()) {
            LOGGER.info("le mouvement est en dehors de la pelouse, la tondeuse ne peut pas bouger vers l'est");

        }else {
            tondeuse.getCoordonnees().setX(estXPosition);
        }
        return tondeuse;
    }
    
    /**
     * Fait avancer la tondeuse d'une position vers le Nord ( y+1 )
     */
    private Tondeuse moveToNorth(){

        int northYPosition = tondeuse.getCoordonnees().getY()+1;
        if (northYPosition  > pelouse.getHauteur()) {
        	
            LOGGER.info("le mouvement est en dehors de le north, la tondeuse ne peut pas bouger vers le north");

        }else {
            tondeuse.getCoordonnees().setY(northYPosition );
        }
      return tondeuse;
    }

    
    /**
     * Fait avancer la tondeuse d'une position vers le Sud ( y-1 )
     */
    private Tondeuse moveToSouth(){
        int southYPosition = tondeuse.getCoordonnees().getY()-1;
        
        if (southYPosition > pelouse.getHauteur()) {
            LOGGER.info("le mouvement est en dehors de le north, la tondeuse ne peut pas bouger vers le sud");
        }else 
        {
            tondeuse.getCoordonnees().setY(southYPosition);
        }
        return tondeuse;
    }

    
}
