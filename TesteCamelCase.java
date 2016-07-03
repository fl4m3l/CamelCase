import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TesteCamelCase 
{
	private CamelCase palavraCamelCase;
	
	@Before
	public void criarCamelCase()
	{
		palavraCamelCase = new CamelCase();
	}
	
	@Test
	public void temCharEspecial()
	{
		assertTrue(palavraCamelCase.temCharEspecial("nome#Composto"));
	}
	
	@Test
	public void comecaComNumero()
	{
		assertTrue(palavraCamelCase.comecaComNumero("10Primeiros"));
	}
	
	@Test
	public void quebraCamelCase()
	{
		List<String> listaDePalavras = new ArrayList<String>();
		try
		{
			listaDePalavras = CamelCase.converterCamelCase("numeroCPFContribuinte");
		}
		catch (StringInvalidaException e) 
		{
			System.out.println(e.getMessage());
		}
		assertEquals(3, listaDePalavras.size());
	}
}
