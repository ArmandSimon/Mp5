import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class tests extends EmpleatBR{
	
	  @Test
	  public void testCalculaSalariBrut1() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Venedor", 2000, 8);
		    	System.out.println(resultat);
		    	Assertions.assertEquals(1360, resultat);
	  }
	 
	  
	  @Test
	  public void testCalculaSalariBrut2() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Venedor", 1500, 3);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1260, resultat);
	  }
	  @Test
	  public void testCalculaSalariBrut3() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Venedor", (float) 1499.99, 0);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1100, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut4() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Encarregat", 1250, 8);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1760, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut5() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Encarregat", 1000, 0);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1600, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut6() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Encarregat", (float) 999.99, 3);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1560, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut7() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Encarregat", 500, 0);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1500, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut8() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Encarregat", 0, 8);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1660, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut9() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Venedor", -1, 8);
	    		System.out.println(resultat);
	    		Assertions.assertEquals("error", resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut10() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Venedor", 1500, -1);
	    		System.out.println(resultat);
	    		Assertions.assertEquals("error", resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariBrut11() {
		    float resultat = EmpleatBR.CalculaSalariBrut(
	    		"Null", 1500, 8);
	    		System.out.println(resultat);
	    		Assertions.assertEquals("error", resultat);
	  }
	  
	  
	  
	  
	  @Test
	  public void testCalculaSalariNet1() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		2000);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1640, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet2() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		1500);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1230, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet3() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		(float) 1499.99);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1259.9916, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet4() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		1250);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(1050, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet5() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		1000);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(840, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet6() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		(float) 999.99);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(999.99, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet7() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		500);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(500, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet8() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		0);
	    		System.out.println(resultat);
	    		Assertions.assertEquals(0, resultat);
	  }
	  
	  @Test
	  public void testCalculaSalariNet9() {
		    float resultat = EmpleatBR.CalculaSalariNet(
	    		-1);
	    		System.out.println(resultat);
	    		Assertions.assertEquals("error", resultat);
	  }
}
