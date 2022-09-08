package utils;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.kata.model.Pelouse;

public class PelouseReaderTest {
	
	@Test
    @DisplayName("Should return Pelouse")
    void shouldCreateAListOfTondeuseExpeditions() {
		
	    final List<String> file = java.util.Arrays.asList("5 5", "1 2 N", "GAGAGAGAA", "3 3 E", "AADAADADDA");
	    Pelouse pelouse = com.kata.utils.PelouseReader.read(file);


        assertAll(
                () -> assertEquals(5, pelouse.getHauteur()),
                () -> assertEquals(5, pelouse.getLongueur())
        );

	}
}
