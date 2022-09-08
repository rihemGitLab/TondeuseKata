package utils;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.kata.model.Orientation;
import com.kata.model.TondeuseInstruction;
import com.kata.utils.TondeuseInstructionReader;


public class TondeuseInstructionReaderTest {
	
	@Test
    @DisplayName("Should retur list of TondeuseInstrucrions ")
    void shouldCreateAListOfTondeuseExpeditions() {
		
	    final List<String> file = Arrays.asList("5 5", "1 2 N", "GAGAGAGAA", "3 3 E", "AADAADADDA");
	    List<TondeuseInstruction> tondeuseInstructions= TondeuseInstructionReader.read(file);
        assertEquals(2, tondeuseInstructions.size());

        TondeuseInstruction tondeuseInstruction1 = tondeuseInstructions.get(0);

        assertAll(
                () -> assertEquals(1, tondeuseInstruction1.getTondeuse().getCoordonnees().getX()),
                () -> assertEquals(2, tondeuseInstruction1.getTondeuse().getCoordonnees().getY()),
                () -> assertEquals(Orientation.NORTH, tondeuseInstruction1.getTondeuse().getOrientation()),
                () -> assertEquals("GAGAGAGAA", String.join("",tondeuseInstruction1.getInstructions()))
        );

		
        TondeuseInstruction tondeuseInstruction2 = tondeuseInstructions.get(1);

		  
        assertAll(
                () -> assertEquals(3, tondeuseInstruction2.getTondeuse().getCoordonnees().getX()),
                () -> assertEquals(3, tondeuseInstruction2.getTondeuse().getCoordonnees().getY()),
                () -> assertEquals(Orientation.EAST, tondeuseInstruction2.getTondeuse().getOrientation()),
                () -> assertEquals("AADAADADDA",  String.join("",tondeuseInstruction2.getInstructions()))
        );
		 

    }

}
