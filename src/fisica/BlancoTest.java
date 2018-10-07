package fisica;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BlancoTest {

	@Test
	void testMovimientoArmonico() {
		Blanco blanco = new Blanco(3.0);
		
		blanco.oscilarBlanco();
		
	}

}