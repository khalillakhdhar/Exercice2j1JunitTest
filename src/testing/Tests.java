package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Tests {
Validation v;
@Before
public void init()
{
v=new Validation(); // permet d'initialiser v pour tous les testes
}
@Test
public void testerpoids()
{
assertTrue(v.validerPoids(60));	

}

@Test
public void testerTaille()
{
assertTrue(v.validerTaille(1.7));	
}
}
