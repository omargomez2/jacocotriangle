package net.osgg.Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
    public void TC08() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Equilatero") );
    }
	
	
	@Test
    public void TC09() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	
	
}

